package jp.personal.app.sample2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

// ComponentScanで指定したパッケージ配下のComponentがDIコンテナに登録される。
// application.propertiesの設定も適用されている模様。
@Configuration
@ComponentScan("jp.personal.app.sample1")
public class JavaConfig {}
