/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

public class App {
    public static void main(String[] args) {
        Object json = JSONValue.parse("{\"hello\":\"Pure Magic!\"}");
        JSONObject data = (JSONObject) json;
        System.out.println(data.get("hello"));
    }
}
