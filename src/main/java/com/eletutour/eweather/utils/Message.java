/*-
 * ========================LICENSE_START=================================
 * EWeather
 * ======================================================================
 * Copyright (C) 2018 - 2019 Erwan Le Tutour
 * ======================================================================
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 * =========================LICENSE_END==================================
 */
package com.eletutour.eweather.utils;

import java.io.Serializable;

public class Message implements Serializable {
    /**
     * Name of the flash attribute.
     */
    public static final String MESSAGE_ATTRIBUTE = "message";

    /**
     * The type of the message to be displayed. The type is used to show message in a different style.
     */
    public static enum Type {
        DANGER, WARNING, INFO, SUCCESS;
    }

    private final String message;
    private final String type;
    private final Object[] args;

    public Message(String message, String type) {
        this.message = message;
        this.type = type;
        this.args = null;
    }

    public Message(String message, String type, Object... args) {
        this.message = message;
        this.type = type;
        this.args = args;
    }

    public String getMessage() {
        return message;
    }

    public String getType() {
        return type;
    }

    public Object[] getArgs() {
        return args;
    }
}
