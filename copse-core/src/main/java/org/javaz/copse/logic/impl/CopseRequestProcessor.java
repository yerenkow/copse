package org.javaz.copse.logic.impl;

import org.javaz.copse.logic.iface.*;
import org.javaz.copse.model.iface.ActionHandlerDescriptorI;
import org.javaz.copse.model.iface.MenuItemI;

import java.util.Iterator;
import java.util.List;

/**
 */
public class CopseRequestProcessor {
    public static final String MENU = "m";
    public static final String ACTION = "a";
    private DataProviderI data;

    public CopseRequestProcessor(DataProviderI provider) {
        this.data = provider;
    }

    public AnswerDataI handleRequest(ParameterProviderI providerI) {
        try {
            String parameter = providerI.getParameter(MENU);
            if (parameter == null) {
                // no menu, nothing to do.
                return null;
            }
            MenuItemI menuItem = data.getMenuItem(Integer.parseInt(parameter));
            if (menuItem != null) {
                Integer entityId = menuItem.getEntityId();
                DescriptorImplI descriptorImpl = data.getDescriptorImpl(entityId);
                List<PermissionCheckerImplI> checkers = data.getPermissionCheckerImpls(entityId);
                UserProfileI profile = UserProfileSessionManager.getProfile(providerI);
                for (PermissionCheckerImplI checker : checkers) {
                    if (!checker.checkPermissions(profile, entityId,
                            descriptorImpl.getPermissionFlagFromAction(providerI))) {
                        // todo correct answer.
                        return null;
                    }
                }
                String action = providerI.getParameter(ACTION);
                List<HandlerI> handlerIs = data.getHandlersForEntity(entityId, action);
                for (HandlerI next : handlerIs) {
                    AnswerDataI answerDataI = next.handleRequest(action, menuItem, profile, descriptorImpl, providerI);
                    if (answerDataI != null) {
                        return answerDataI;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
