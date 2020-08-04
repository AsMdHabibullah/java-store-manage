# Java OOP(Object Oriented Programming) concepts and maven project setup

## Default java or spacific version of java, jdk, & maven install
### Editor install, OS path setup and connect to github

### Module of Java programming language
```
    1. vairable
    2. data type
    3. statement
    4. condition
    5. function/method
    6. class & object
    7. inheritance
    8. polymorphism
    9. abstraction
    10.encapsulution
    11.interface
```

### 01. variable
```
data type, var name
ex: int a, b, c;
```
### 02. data type
```
number
byte,
char,
double,
bolean [true, false]
```
### 03. statement
```
true
false
<
>
!<
!>
===
!=
```
### 04. condition
```
if
else
else if
swtch
catch
```

### 05. function/method
```
greed(khabar){
khabar process
}
```

### 06. class & object
```
Class & object is nothing but we can think it's one kinde of container where we can store so many information.
```

### 07. inheritance
```
Inheritance meansce we have a class or object that is also call super class or super object and this super class we can call to any others class and we can marge bothe is one class.
```

### 08. polymorphism
```
Polymorphism is the ability of an object to take on many forms. The most common use of polymorphism in OOP occurs when a super class reference is used to refer to a child class object.
```

### 9. abstraction
```
It's unimplimennted super class method and this method must need be impliment when chiled class will call the super class.
```

### 10. encapsulution
```
Encapsulation in Java is a mechanism of wrapping the data (variables) and code acting on the data (methods) together as a single unit. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. T
```

### 11. interface
```
An interface is a reference type in Java. It is similar to the class. It is a collection of abstract methods. A class implements an interface, thereby inheriting the abstract methods of the interface.
```

## This project setup according to the maven architecture
```
Install maven accourding to the OS and for setup the maven project need to write some terminal command or need to create manualy from the editor. In my case I'm using Linux and thats whty I'm using command line terminal.

    ## Command
    01. sudo apt update
    02. sudo apt install maven
    03. mvn -version
    04. sudo apt update
    05. sudo apt install default-jdk
    06. java -version
    ##  Done maven and java instalation
    ##  Create maven project
    01. mvn --version
    02. mvn archetype:generate
    # Creation done maven project and maven will be genarate a pom.xml file and this file will contain all the dependancy of the project.
```

### After all now you can write the java code.

### My project details
```
Total dependency for this is: springframework, springfox, swagger, SQL, h2database, and junit.

In this project have a folder, name is resources and in resources have a file and it's application.properties. This file's work for setups the database, port, static, etc.

Total classes: SwaggerConfig, Store, Product, HomeController, StoreController, ProductController.
Class methods: home, getStores, postStore, saveOrUpdateStore, deleteStore, getProducts, postProduct, saveOrUpdateProduct, deleteProduct.

    Details of all classes: In this project I used MVC(model views controller) module.
    01. SwaggerConfig: The swagger a super tools to write the very well documentation of the API and this class is all the setup.
    02. Store: It's a entity class and help of theis class I can create the new store and also can save the store in databse.
    03. Product: This is also entity class and it's same as store class but for create the new product before must have to have a store in database.
    04. HomeController: This class for home views and it's will contain all of the documentation of the project.
    05. StoreController: For create a new store this class will help me because it's a api endpoint views section.
    06. ProductController: It's same as store controller but when want to create a new product before in database have to have a store and this store id need to provide in product.

    Details of class methods: For save the store and product in database need to use all controller class methode.
    01. home: It's for home documentation view need to use this method.
    02. getStores: To back all the store from database need to use this method.
    03. postStore: To create the new store need to use this method.
    04. saveOrUpdateStore: Existing store in database if want to update then need to use this  method and also need to provide existing sore id.
    05. deleteStore: For delate the existing store need to use this method and this method take the id of the store after thet i't will delete the store.
    06. getProducts: It's same as the get store method but for get the product must need to provide a store id and this method will get all the product accourding to the store id.
    07. postProduct: This method will take a store id and coourding to the is this method can create a new product.
    08. saveOrUpdateProduct: For update the existing product this method can help us but need to provide the existing product id.
    09. deleteProduct: For delete the existing product this method can help us but need to provide product id for delete the exact product.
    
```

### That's all for this project.

```
Thanks
As Md Habibullah
Yunnan University
Department of Computer Science & Technology
```