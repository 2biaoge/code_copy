项目直接调用私服中的jar/war包
 项目中配置私服地址：直接通过项目发布到私服服务器。
不需要修改整体settings.xml仓库地址，只是针对单个项目修改测试。
settings.xml正常指向阿里云的地址不受影响。
<!-- 下载构建配置 -->
	<repositories>
		<repository>
			<id>release</id>
			<name>release</name>
			<url>http://localhost:8081/nexus/content/repositories/releases/</url>
		</repository>
	</repositories>
	<!-- 上传构建配置 -->
	<distributionManagement>
		<repository>
			<id>release</id>
			<name>release</name>
			<url>http://localhost:8081/nexus/content/repositories/releases/</url>
		</repository>
	</distributionManagement>
注意：
pom.xml的配置内容是release不是releases（非快照版）