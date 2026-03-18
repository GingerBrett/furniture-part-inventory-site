## Part C-  
> Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
- mainscreen.html was the file changed
- The changes entailed modifying the title tag contents to be Brett's Furniture Shop on line 14,
- modifying the h1 tag contents to be Brett's Furniture Shop on line 19, and 
- modifying the h1 tag contents to be Furniture on line 53.
- I didn't change the h1 tag on line 21 that read Parts, because that still fit my chosen business model.

## Part D-
> Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
- about.html was created with a short paragraph about Brett's Furniture Shop
- AboutScreenController.java was created
- mainscreen.html was modified to include a button for accessing the about page on line 20.

## Part E-
> Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
- Changes were made to BootStrapData.java on lines 43 to 107
- Five objects were added to the Part repository and Product repository

## Part F-
> Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

> The “Buy Now” button must be next to the buttons that update and delete products.

> The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.

> Display a message that indicates the success or failure of a purchase.
- mainscreen.html was updated to include a Buy Now button next tho the Delete button. Code was added to line 86.
- Failure.html and Success.html were both created  to display their respective messages.
- AddProductController.java was renamed AddFurnitureController.java for preference, then a new GetMapping method was created called buyFurniture to display each previously mentioned HTML page and decrement a successful purchase upon click

## Part G-
> Modify the parts to track maximum and minimum inventory by doing the following:

>  Add additional fields to the part entity for maximum and minimum inventory.

>  Modify the sample inventory to include the maximum and minimum fields.

>  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.

>  Rename the file the persistent storage is saved to.

>  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
- Made changes to Part.Java on lines 23, 33-36, and 90-102. Min and Max Inventory fields were added with their getters and setters and a connection to the ValidInventory.java validator
- Made changes to BootStrap.java at lines 49-51, 58-60, 67-69, 77-79, 86-88, and 95-97. Min and Max Inventory were set for each part. And a fix with the Part Id was made.
- Made changes to InHousePartForm.html at lines 16-38 and to OutsourcedPartForm.html at lines 17-39. Min and Max input fields were added to each form as well as validation output.
- Made changes to application.properties at line 6. The persistent database was renamed.
- Created InventoryValidator.java and ValidInventory.java to enforce the min and max inventories.

## Part H-
> Add validation for between or at the maximum and minimum fields. The validation must include the following:

>  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.

>  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.

>  Display error messages when adding and updating parts if the inventory is greater than the maximum.
- Displaying the error messages for out of bounds inventory inputs that Part H requires was taken care of in Part G with the implementation of InventoryValidator.java and ValidInventory.java.
- Changes were made to EnufPartsValidator.java at lines 36-42. The query logic was changed to validate that the minInventory be adhered to and a constraint validator was added to display an error message
- ProductForm.html already had cod to display any recieved error messages, so I did not need to add this.

## Part I-
> Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
- Changes were made to PartTest.java to include two addition tests for the max and min inventory setter methods on lines 159-177.

## Part J-
> Remove the class files for any unused validators in order to clean your code.
- DeletPartValidator.java and ValidDeletePart.java were unused and thus removed to clean up code.