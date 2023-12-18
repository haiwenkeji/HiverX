/* Copyright 2014-2023 delicacylee@vip.sina.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package plus.hiver.admin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * HiverX应用运行类
 *
 * <p>
 * 尊重知识产权，CV 请保留版权，海文科技 https://hiver.cc 出品，不允许非法使用，后果自负
 * </p>
 *
 * @author Yazhi Li
 */
@SpringBootApplication
public class HiverApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(HiverApplication.class, args);
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
