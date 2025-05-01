## AddCookAPI

### 🏷️ 최신 버전 확인하기
AddCookAPI 최신버전을 확인한 후, VERSION부분에 최신버전을 적어주세요.  
![Image](https://github.com/user-attachments/assets/079b0dbc-04be-4e4c-8d63-1b8e545f7d92)

### 📌 Project Setup
📄 **Maven POM**
```xml
<repository>
  <id>morebetter-releases</id>
  <name>More&amp;Better</name>
  <url>https://repo.morebetter.co.kr/releases</url>
</repository>
<dependency>
  <groupId>com.github.teamhungry22</groupId>
  <artifactId>addcook</artifactId>
  <version>VERSION</version>
  <scope>provided</scope>
</dependency>
```
📄 **Gradle Groovy**
```gradle
repositories {
  maven {
    name "morebetterReleases"
    url "https://repo.morebetter.co.kr/releases"
  }
}

dependencies {
  compileOnly "com.github.teamhungry22:addcook:VERSION"
}
```
📄 **Kotlin DSL**
```gradle
repositories {
  maven {
    name = "morebetterReleases"
    url = uri("https://repo.morebetter.co.kr/releases")
  }
}

dependencies {
  compileOnly("com.github.teamhungry22:addcook:VERSION")
}
```
