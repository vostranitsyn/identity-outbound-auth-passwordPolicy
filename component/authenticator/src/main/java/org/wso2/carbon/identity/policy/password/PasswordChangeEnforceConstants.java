/*
 *  Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 *  WSO2 Inc. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 *
 */

package org.wso2.carbon.identity.policy.password;

/**
 * Password Change authenticator's constants
 */
public class PasswordChangeEnforceConstants {
    public static final String AUTHENTICATOR_NAME = "password-reset-enforcer";
    public static final String AUTHENTICATOR_TYPE = "LOCAL";
    public static final String STATE = "state";

    public static final String CURRENT_PWD = "CURRENT_PWD";
    public static final String NEW_PWD = "NEW_PWD";
    public static final String NEW_PWD_CONFIRMATION = "NEW_PWD_CONFIRMATION";

    public static final String IDM_PROPERTIES_FILE = "identity-mgt.properties";
    public static final String CREDENTIAL_EXP_IN_DAYS = "Authentication.Policy.Password.Reset.Time.In.Days";
    public static final int DEFAULT_CREDENTIAL_EXP_IN_DAYS = 30;

    public static final String LAST_CREDENTIAL_UPDATE_TIMESTAMP_CLAIM =
            "http://wso2.org/claims/identity/lastPasswordUpdateTime";
    public static final String EMAIL_ADDRESS_CLAIM = "http://wso2.org/claims/emailaddress";

    public static final String PASSWORD_CHANGE_STREAM_NAME =
            "org.wso2.carbon.identity.policy.password.PasswordChanges:1.0.0";
    public static final String PASSWORD_CHANGE_EVENT_HANDLER_NAME = "passwordChangeEventHandler";

    private PasswordChangeEnforceConstants() {      // To prevent instantiation
    }
}
