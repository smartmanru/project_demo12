# Проект простого мультмодульного приложения

<b>Проект состоит из 6 модулей:</b>
- "demo-multimodule-bom"        - Модуль BOM (Maven Bill of Material)
- "demo-multimodule-checkstyle" - Модуль проверки стиля написания исходного кода
- "demo-multimodule-parent"     - Модуль Maven-parent
- "demo-multimodule-domain"     - Модуль доменных сущьностей
- "demo-multimodule-service1"   - Исполняемый Модуль Spring Boot приложения для работы с JPA (Сервис 1)
- "demo-multimodule-service2"   - Исполняемый Модуль Spring Boot приложения для работы с REST "demo-multimodule-service1" (Сервис 2)

В корневом каталоге проекта агрегирующий файл pom.xml, описывающий порядок maven-сборки 6 модулей.

<b>Cборка Maven-проекта:</b>
- в корневом каталоге проекта выполнить: "mvn clean install" 

<b>Результат сборки Maven-проекта:</b>
- JAR-файл для исполняемого приложения "service1": demo-multimodule-service1/target/demo-multimodule-service1-1.0-SNAPSHOT.jar
- JAR-файл для исполняемого приложения "service2": demo-multimodule-service1/target/demo-multimodule-service2-1.0-SNAPSHOT.jar 

<b>Порядок локального запуска модулей проекта:</b>
1. В каталоге demo-multimodule-service1 выполнить: "mvn spring-boot:run"
2. В веб-браузере открыть http://localhost:8090/api/authors/ - будет загружен json файл с результатом запроса.
3. В каталоге demo-multimodule-service2 выполнить: "mvn spring-boot:run"
4. В веб-браузере открыть http://localhost:8080/ - будет отражена страница.

<b>Порядок развертывания модулей проекта:</b>
для работы приложения необходимо развернуть 3 узла.

1. На узле 1 разворачивается и настраивается база PostgreSQL 9

2. На узле 2 разворачивается сервис 1 и запускается: "java -jar demo-multimodule-service1-1.0-SNAPSHOT.jar". <br><br>
   Для его работы необходимо установить следующие переменные среды окружения:
	DATASOURCE_URI - URI к базе данных (можно использовать H2 и PostgreSql другие драйвера просто не добавлены в 
                         дистрибутив). Например: jdbc:postgresql://localhost:5432/book
	DATASOURCE_USERNAME - имя пользователя БД
	DATASOURCE_PASSWORD - пароль пользователя БД
	Схема базы создается автоматически и туда при запуске добавляется запись. При остановке схема удаляется.

3. На узле 3 разворачивается сервис 2 и запускается: "java -jar demo-multimodule-service2-1.0-SNAPSHOT.jar". <br><br>
   Для его работы необходимо установить следующие переменные среды окружения:
	SERVICE1_URI - URI к REST объекту сервиса 1. Например: http://localhost:8090/api/authors/1. Лучше менять только 
                       хост и порт.





