/*
 * Copyright (C) 2008 feilong
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.feilong.core.net.urlutiltest;

import static org.junit.Assert.assertEquals;

import java.net.URL;

import org.junit.Test;

import com.feilong.core.net.URIUtil;
import com.feilong.core.net.URLUtil;

public class URLUtilToURITest{

    //************com.feilong.core.net.URLUtil.toURI(URL)**************
    @Test
    public void testToURI(){
        URL url = URLUtil.toURL("http://www.exiaoshuo.com/jinyiyexing/");
        assertEquals(URIUtil.create("http://www.exiaoshuo.com/jinyiyexing/"), URLUtil.toURI(url));
    }

    @Test
    public void testToURINullURL(){
        assertEquals(null, URLUtil.toURI(null));
    }
}
