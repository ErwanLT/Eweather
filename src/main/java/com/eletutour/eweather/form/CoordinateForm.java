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
package com.eletutour.eweather.form;

import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * form of the main page
 *
 * @author ewanletutour
 * @since 1.0.0
 */
@Getter
@Setter
@Data
public class CoordinateForm {

    @ApiParam(name = "location", value = "A string like city name, country name, or postal code", required = true, example = "Paris or 75001")
    private String location;

    private boolean timeMachine;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public CoordinateForm(){
        this.timeMachine = false;
    }

    public CoordinateForm(String location, boolean timeMachine, Date date) {
        this.location = location;
        this.timeMachine = timeMachine;
        this.date = date;
    }
}
