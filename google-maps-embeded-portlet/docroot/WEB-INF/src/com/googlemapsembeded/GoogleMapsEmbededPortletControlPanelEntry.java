package com.googlemapsembeded;

import com.liferay.portal.model.Portlet;
import com.liferay.portal.security.permission.PermissionChecker;
import com.liferay.portlet.BaseControlPanelEntry;


/**
 * Control panel entry class GoogleMapsEmbededPortletControlPanelEntry
 */
public class GoogleMapsEmbededPortletControlPanelEntry extends BaseControlPanelEntry {
       
    /**
     * @see com.liferay.util.bridges.mvc.MVCPortlet#com.liferay.util.bridges.mvc.MVCPortlet()
     */
    public GoogleMapsEmbededPortletControlPanelEntry() {
        super();
    }

    @Override
    public boolean isVisible(PermissionChecker permissionChecker, Portlet portlet)
            throws Exception {
        return false;
    }

}