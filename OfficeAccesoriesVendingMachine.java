import java.util.Scanner;
public class OfficeAccessoriesVendingMachine {
static void showProducts (){
System.out.println("----------Available Products----------");
System.out.println("1. Keyboard       ₹800");
System.out.println("2. Mouse            ₹500");
System.out.println("3. Headphone    ₹1000");
System.out.println("4. USB Cable      ₹200");
System.out.println("5. Charger.         ₹700");
System.out.println("------------------------------");
}
static void selectProduct(){
selectedProduct = 0;
selectedQuantity = 0;
System.out.println("Enter Product Number: ");
int item=sc.nextInt();
System.out.println("Enter quantity: ");
int qty=sc.nextInt();
if(qty<=0){
System.out.println("Invalid Number!");
return;
}
switch(item){
case 1:
if(qty>keyboardStock){
System.out.println("Sorry! We do not have enough stock");
}else if(qty<=keyboardStock){
System.out.println("Keyboard is selected");
selectedQuantity=qty;
selectedProduct=1;
}
break;
case 2:
if(qty>mouseStock){
System.out.println("Sorry! We do not have enough stock");
}else if(qty<=mouseStock){
System.out.println("Mouse is selected");
selectedQuantity=qty;
selectedProduct=2;
}
break;
case 3:
if(qty>headphoneStock){
System.out.println("Sorry! We do not have enough stock");
}else if(qty<=headphoneStock){
System.out.println("Head Phone is selected");
selectedQuantity=qty;
selectedProduct=3;
}
break;
case 4:
if(qty>usbCableStock){
System.out.println("Sorry! We do not have enough stock");
}else if(qty<=usbCableStock){
System.out.println("USB Cable is selected");
selectedQuantity=qty;
selectedProduct=4;
}
break;
case 5:
if(qty>chargerStock){
System.out.println("Sorry! We do not have enough stock");
}else if(qty<=chargerStock){
System.out.println("Charger is selected");
selectedQuantity=qty;
selectedProduct=5;
}
break;
default:
System.out.println("Invalid product number");
break;
}
}
static void checkStock(){
System.out.println("Enter Product number to check available stock!");
int productNum=sc.nextInt();
System.out.println("------Availble Stock-------");
switch(productNum){
case 1:
System.out.println("Product Name  |    Price |                 Stock ");
System.out.println("Keyboard           800    "+keyboardStock);
break;
case 2:
System.out.println("Product Name  |    Price    |     Stock ");
System.out.println("Mouse           500    "+mouseStock);
break;
case 3:
System.out.println("Product Name  |    Price  |                  Stock ");
System.out.println("HeadPhone          1000    "+headphoneStock);
break;
case 4:
System.out.println("Product Name  |    Price                  | Stock ");
System.out.println("USB Cable           200    "+usbCableStock);
break;
case 5:
System.out.println("Product Name   |   Price                  | Stock ");
System.out.println("Charger           700    "+chargerStock);
break;
default:
System.out.println("Invalid Product Number");
}
}
static void issueProduct(){
if (selectedProduct == 0) {
System.out.println("Please select a product first!");
return;
}

if (selectedQuantity <= 0) {
System.out.println("Invalid number!");
return;
}

int price = 0;

switch (selectedProduct) {
case 1:
price = 800;
break;
case 2:
price = 500;
break;
case 3:
price = 1000;
break;
case 4:
price = 200;
break;
case 5:
price = 700;
break;
}
int totalPrice = price * selectedQuantity;
int discount = 0;

if (totalPrice >= 2000) {
discount = totalPrice * 10 / 100;
}

int finalPrice = totalPrice - discount;

switch( selectedProduct){
case 1:
if( selectedQuantity>keyboardStock){
System.out.println("Sorry! We do not have enough stock");
}else if( selectedQuantity <=keyboardStock){
System.out.println("Keyboard is issued for you");
keyboardStock=keyboardStock- selectedQuantity;
lastIssuedProduct = selectedProduct;
lastIssuedQuantity = selectedQuantity;
lastFinalPrice = finalPrice;

System.out.println("Total Price: ₹" + totalPrice);

if (discount > 0) {
System.out.println("Discount: ₹" + discount);
} else {
System.out.println("No discount available!");
}

System.out.println("Final Price: ₹" + finalPrice);

selectedProduct = 0;
selectedQuantity = 0;
}
break;
case 2:
if(selectedQuantity>mouseStock){
System.out.println("Sorry! We do not have enough stock");
}else if(selectedQuantity<=mouseStock){
System.out.println("Mouse is issued for you");
mouseStock=mouseStock-selectedQuantity;
lastIssuedProduct = selectedProduct;
lastIssuedQuantity = selectedQuantity;
lastFinalPrice = finalPrice;

System.out.println("Total Price: ₹" + totalPrice);

if (discount > 0) {
System.out.println("Discount: ₹" + discount);
} else {
System.out.println("No discount available!");
}

System.out.println("Final Price: ₹" + finalPrice);

selectedProduct = 0;
selectedQuantity = 0;
}
break;
case 3:
if(selectedQuantity>headphoneStock){
System.out.println("Sorry! We do not have enough stock");
}else if(selectedQuantity<=headphoneStock){
System.out.println("Head Phone is issued for you");
headphoneStock=headphoneStock-selectedQuantity;
lastIssuedProduct = selectedProduct;
lastIssuedQuantity = selectedQuantity;
lastFinalPrice = finalPrice;

System.out.println("Total Price: ₹" + totalPrice);

if (discount > 0) {
System.out.println("Discount: ₹" + discount);
} else {
System.out.println("No discount available!");
}

System.out.println("Final Price: ₹" + finalPrice);

selectedProduct = 0;
selectedQuantity = 0;
}
break;
case 4:
if(selectedQuantity>usbCableStock){
System.out.println("Sorry! We do not have enough stock");
}else if(selectedQuantity<=usbCableStock){
System.out.println("USB Cable is issued for you");
usbCableStock=usbCableStock- selectedQuantity;
lastIssuedProduct = selectedProduct;
lastIssuedQuantity = selectedQuantity;
lastFinalPrice = finalPrice;

System.out.println("Total Price: ₹" + totalPrice);

if (discount > 0) {
System.out.println("Discount: ₹" + discount);
} else {
System.out.println("No discount available!");
}

System.out.println("Final Price: ₹" + finalPrice);

selectedProduct = 0;
selectedQuantity = 0;
}
break;
case 5:
if(selectedQuantity>chargerStock){
System.out.println("Sorry! We do not have enough stock");
}else if(selectedQuantity<=chargerStock){
System.out.println("Charger is issued for you");
chargerStock=chargerStock-selectedQuantity;
lastIssuedProduct = selectedProduct;
lastIssuedQuantity = selectedQuantity;
lastFinalPrice = finalPrice;

System.out.println("Total Price: ₹" + totalPrice);

if (discount > 0) {
System.out.println("Discount: ₹" + discount);
} else {
System.out.println("No discount available!");
}

System.out.println("Final Price: ₹" + finalPrice);

selectedProduct = 0;
selectedQuantity = 0;
}
break;
default:
System.out.println("Invalid product number");
break;
}

}
}
static void viewMyTransaction(){
System.out.println("Enter Employee ID: ");
String idEmp=sc.next();
if(idEmp.equalsIgnoreCase(id)){
System.out.println("-------Transaction--------");
if(lastIssuedProduct == 0){
System.out.println("No transaction found!");
}else{
switch(lastIssuedProduct){
case 1:
System.out.println("Product Name: Keyboard");
break;
case 2:
System.out.println("Product Name: Mouse");
break;
case 3:
System.out.println("Product Name: Headphone");
break;
case 4:
System.out.println("Product Name: USB Cable");
break;
case 5:
System.out.println("Product Name: Charger");
break;
}
System.out.println("Quantity Issued: " + lastIssuedQuantity);
System.out.println("Final Price: ₹" + lastFinalPrice);
}
}
}
static Scanner sc=new Scanner(System.in);
static int keyboardStock=10;
static int mouseStock=8;
static int headphoneStock=9;
static int usbCableStock =15;
static int chargerStock=20;
static int selectedProduct = 0;
static int selectedQuantity = 0;
static int lastIssuedProduct = 0;
static int lastIssuedQuantity = 0;
static int lastFinalPrice = 0;
static String lastIssuedEmployee = "";
static String id="E87M54";
public static void main(String[]args){

System.out.println("---------OFFICE ACCESSORIES VENDING MACHINE--------");
System.out.println("Enter Employee ID: ");
String empId=sc.next();
if(empId.equalsIgnoreCase(id)){
System.out.println("Welcome, "+id);
System.out.println();
while(true){
System.out.println("1. View Products");
System.out.println("2. Select Product");
System.out.println("3. Check Stock");
System.out.println("4. Issue Product");
System.out.println("5. View my transaction");
System.out.println("6. Exit");
System.out.println("Enter your choice: ");
int choice=sc.nextInt();
if(choice==1){
showProducts();
}else if(choice==2){
selectProduct();
}else if(choice==3){
checkStock();
}else if(choice==4){
issueProduct();
}else if(choice==5){
viewMyTransaction();
}else if(choice==6){
System.out.println("Thank you for using the vending machine!");
break;
}else{
System.out.println("Invalid choice! Please try again.");
}
}
}else{
System.out.println("Please enter a valid ID!");
}
}
}
