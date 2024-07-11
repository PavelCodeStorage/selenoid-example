Selenium with Selenoid
---
Overview:
---
 
Repository provide configuration example of Selenium with Selenoid
import org.apache.commons.lang3.RandomStringUtils;

int length = 10;
    boolean useLetters = true;
    boolean useNumbers = false;

ArrayList myList = new ArrayList();
myList.add("906f4d05-2fcb-426f-a058-dd4fd74f72ad");
myList.add("08e7f5bc-a6be-4a53-9eba-31383c5673fa");
myList.add("3bedcd65-4af5-4c81-9e9a-560e49b163c0");
myList.add("00ba1d92-39df-4f91-a8bd-7fa0b99b8ee2");
myList.add("b21fa4cb-aadd-46e5-b3b9-3cd280071adb");
myList.add("aaab8b7c-e1fd-484f-bec1-0d06bcb0ed23");
myList.add("7c694e38-9fc3-4a64-b875-6c183e2f8203");
myList.add("6c78fec8-c44e-40d2-95ce-242f1d960ba7");
myList.add("12e37548-625a-482d-baf9-9e66171d3433");
myList.add("5798058c-ef35-4a2d-a44c-524c739dd107");
myList.add("7c53ca5e-d03a-4909-ab62-7885db0fcb9f");
myList.add("d8deaa75-9a54-41fb-a32e-7c361b881186");
myList.add("59889839-a693-47d4-bc82-e9a28b4fbb58");
myList.add("4776f3a2-ddad-4ea9-9379-abf1fc7071f9");
myList.add("4776f3a2-ddad-4ea9-9379-abf1fc7071f9");
myList.add("7fda022e-c866-4c95-b252-7e533e490dd0");
myList.add("816007ac-a799-4028-9f9d-540f6a0c52d8");
myList.add("62e84056-517f-4d60-b219-e8f05a7454f4");
myList.add("9241acf5-b6bb-42cc-9d7b-299c53eaf4ce");
myList.add("4f38d2a2-c6f7-42e6-820c-8ea1b3767018");
myList.add("8da829ac-424d-4fcc-8936-01b759ffe76a");
myList.add("76870757-6708-4728-a0ad-8a331cc286f9");
myList.add("b0462b0b-bcf8-4205-b5e8-834bfe4e8fc8");
myList.add("fa805cc9-daeb-4858-bb6d-09e000afa525");
myList.add("a21d6857-89af-430f-a140-39abaafe3814");
myList.add("0960ec2b-6fe8-482e-9663-923fc48fb90a");
myList.add("8962a180-ec3a-4461-b68e-10019fb7f98f");
myList.add("a3bff24a-20a8-4d37-9476-6ec4f3bb84fd");
myList.add("bca21e89-77a7-4ae4-9334-1561ab9b287e");
myList.add("fbf0835b-3226-4112-a9f0-53f56d4c801d");


   Random ran = new Random();
   int nxt = ran.nextInt(myList.size());

vars.put("randomValue",myList.get(nxt)); 

---
**What you need to do:**
1. Install docker (https://docs.docker.com/docker-for-windows/release-notes/#docker-community-edition-17031-ce-win12--2017-05-12)
3. Navigate to the folder with **docker-compose.yml** file and execute from command line command: **docker-compose up**
4. Wait until all necessary images are downloaded  :)
4. Download vnc image: **docker pull selenoid/vnc:chrome_65.0**
5. Download image for video recording **docker pull selenoid/video-recorder:latest-release**
6. From command line execude command: **docker ps -a**  (see created containers) 
7. Navigate to the localhost:8080 (see: ![selenoidui](https://user-images.githubusercontent.com/26840848/39272875-e926f05a-48e5-11e8-806f-9847aaa59e52.jpg)
7. Don't forget to add some changes in your code see :
```java
        if (driver == null) {
            DesiredCapabilities browser = new DesiredCapabilities();
            browser.setBrowserName("chrome");
            browser.setVersion("65.0");
            browser.setCapability("enableVNC", true);

            try {
                driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), browser);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
        return driver;
```
7. Run out tests : **mvn clean test**
8. See how tests pass (see: ![selenoidvnc](https://user-images.githubusercontent.com/26840848/39272905-fedb162e-48e5-11e8-9284-bdbb73b106dc.jpg))
8. Even with docker you can make screenshoots and added it in reporting (i.e add image see: 
![dockerimagesallureresults](https://user-images.githubusercontent.com/26840848/39099117-67de4f9e-467d-11e8-9f75-04155c2e0b58.jpg)


