/*
 * Copyright 2018 Blue Lotus Software, LLC.
 * Copyright 2018 John Yeary <jyeary@bluelotussoftware.com>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.bluelotussoftware.example;

import java.util.Date;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * A simple service that returns the current date when called.
 *
 * @author <a href="mailto:jyeary@bluelotussoftware.com">John Yeary</a>
 * @version 1.0.0
 */
@WebService
public class Simple {

    /**
     * This operation returns the current date when it was run.
     *
     * @return current date.
     */
    @WebMethod(operationName = "getCurrentDate")
    public Date getCurrentDate() {
        return new Date();
    }

}
