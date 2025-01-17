/*
 * (C) Copyright 2017 Boni Garcia (http://bonigarcia.github.io/)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package io.github.bonigarcia.wdm.config;

/**
 * Custom exception for WebDriverManager.
 *
 * @author Boni Garcia
 * @since 1.7.2
 */
public class WebDriverManagerException extends RuntimeException {

    private static final long serialVersionUID = 635198548542132913L;

    public WebDriverManagerException(String message) {
        super(message);
    }

    public WebDriverManagerException(Throwable cause) {
        super(cause);
    }

    public WebDriverManagerException(String message, Throwable cause) {
        super(message, cause);
    }

}
