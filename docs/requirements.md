# Bookstore

* Bookstore is an online shoppingcart application to sell books.
* The backoffice team configures the book catalog, their prices, upload book cover images.
* The backoffice team should be able to upload book catalog in Excel format.
* The customers can browse through catalog, add books to cart and place orders.
* Customers can pay through credit cards or delivery on cash.
* The order updates like successful order creation, order status updates and cancellations should be notified to customier via email and SMS.
* The backoffice team can view customer orders, update status or cancel them.
* Customers can view their orders and canel them.

## Actors

1. SuperAdmin: The super admin can do everything. A SuperAdmin can create other Admin users.
2. Admin: The Admin users are backoffice team.
3. Customers: The end users of the bookstore website.
4. Delivery Team: The delivery team can update the order status after delivering the items to customers.

## Application Technical Design:

### Modules:

1. bookstore-api: SpringBoot based REST API
2. bookstore-web-ui: Customer facing shoppingcart website
3. bookstore-admin-ui: Backoffice admin portal.

### TechStack:

- Java 8
- SpringBoot
- ReactJS
- Postgresql
- Maven
- Jenkins
- SonarQube

## Release Planning:

1. Sprint 1:

   - Initial bookstore-api, bookstore-web-ui and bookstore-admin-ui setup
   - Jenkins pipeline setup
   - SonarQube Codequality setup

2. Sprint 2:

   - Initial book catalog data setup
   - REST endpoint to fetch all products
   - Display all products in shoppingcart

3. Sprint 3:

   - REST endpoint to fetch product details for a given product id
   - Display product details

4. Sprint 4:

   - Add to cart feature from Product list and Product details page
   - Show cart details page

5. Sprint 5:

   - REST endpoint to create an order
   - Create order

6. Sprint 6:

   - REST endpoints Security
   - Customer Login, Registration

7. Sprint 7:

   - REST endpoints for managing products
   - Backoffice UI for managing products

8. Sprint 8:

   - Customer UI for managing orders
   - Backoffice UI for managing orders

9. Sprint 9:

   - Backoffice Bulk import products
   - Generate Reports
