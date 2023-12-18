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
package plus.hiver.config.swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger接口配置
 *
 * <p>
 * 尊重知识产权，CV 请保留版权，海文科技 https://hiver.cc 出品，不允许非法使用，后果自负
 * </p>
 *
 * @author Yazhi Li
 */
@Configuration
public class Swagger2Config {
    @Value("${swagger.title:Hiver}")
    private String title;

    @Value("${swagger.description:Api Documentation}")
    private String description;

    @Value("${swagger.version:1.0}")
    private String version;

    @Value("${swagger.termsOfServiceUrl:https://hiver.cc}")
    private String termsOfServiceUrl;

    @Value("${swagger.contact.name:Hiver}")
    private String name;

    @Value("${swagger.contact.url:https://hiver.cc}")
    private String url;

    @Value("${swagger.contact.email:delicacylee@vip.sina.com}")
    private String email;

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().info(new Info().title(title).description(description)
                .version(version).contact(new Contact().name(name).url(url).email(email))
                .termsOfService(termsOfServiceUrl));
    }
}
