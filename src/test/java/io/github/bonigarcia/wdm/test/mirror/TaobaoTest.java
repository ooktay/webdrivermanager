/*
 * (C) Copyright 2016 Boni Garcia (http://bonigarcia.github.io/)
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
package io.github.bonigarcia.wdm.test.mirror;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import java.io.File;
import java.net.URL;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.WebDriverManagerException;

/**
 * Test for taobao.org mirror.
 *
 * @author Boni Garcia
 * @since 1.6.1
 */

class TaobaoTest {

    WebDriverManager wdm = WebDriverManager.chromedriver()
            .avoidBrowserDetection().useMirror().forceDownload();

    @Disabled("Flaky test due to slow response of npm.taobao.org")
    @Test
    void testTaobao() throws Exception {
        wdm.config().setChromeDriverMirrorUrl(
                new URL("http://npm.taobao.org/mirrors/chromedriver/"));
        wdm.setup();
        File driver = new File(wdm.getDownloadedDriverPath());
        assertThat(driver).exists();
    }

    @Disabled("Flaky test due to cnpmjs.org")
    @Test
    void testOtherMirrorUrl() throws Exception {
        wdm.config().setChromeDriverMirrorUrl(
                new URL("https://cnpmjs.org/mirrors/chromedriver/"));
        wdm.setup();
        File driver = new File(wdm.getDownloadedDriverPath());
        assertThat(driver).exists();
    }

    @Test
    void testTaobaoException() {
        WebDriverManager manager = WebDriverManager.edgedriver();
        assertThatThrownBy(manager::useMirror)
                .isInstanceOf(WebDriverManagerException.class);
    }

}
