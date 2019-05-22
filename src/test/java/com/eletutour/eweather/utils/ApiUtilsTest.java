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

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static com.eletutour.eweather.utils.ApiUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApiUtilsTest {

    @Test
    public void testDArkKSyUrl(){
        String url = getDarkSkyUrl("test", "test");
        assertThat(url).isNotNull()
            .contains(DARK_SKY_URL)
            .contains(DARK_SKY_LANG)
            .contains(DARK_SKY_SI_UNIT)
            .contains(DARK_SKY_EXCLUDE);
    }

    @Test
    public void testLocationIQUrl(){
        String url = getLocationiqUrl("Paris");
        assertThat(url).isNotNull()
            .contains(LOCATIONIQ_URL1)
            .contains(LOCATIONIQ_URL2);
    }

    @Test
    public void testDarkSkyConstant(){
        assertThat(DARK_SKY_URL).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_LANG).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_SI_UNIT).isNotNull().isNotEmpty();
        assertThat(DARK_SKY_EXCLUDE).isNotNull().isNotEmpty();
    }

    @Test
    public void testLocationIQConstant(){
        assertThat(LOCATIONIQ_URL1).isNotNull().isNotEmpty();
        assertThat(LOCATIONIQ_URL2).isNotNull().isNotEmpty();
    }
}
