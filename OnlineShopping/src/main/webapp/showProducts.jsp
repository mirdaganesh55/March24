<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<f:view>
	<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Product Details</title>
<style>
body {
	font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	display: flex;
	flex-direction: column;
	min-height: 100vh;
	/* Ensures the body takes at least the full viewport height */
}

.main-container {
	background-color: blue;
}

.container {
	max-width: 1200px;
	margin: 0 auto;
}

h2 {
	text-align: center;
	color: #2874f0; /* Flipkart's blue color */
	margin-bottom: 30px;
}

.grid-container {
	display: flex;
	flex-wrap: wrap;
	justify-content: space-around;
}

.grid-item {
	background: radial-gradient(circle, rgba(0,249,181,1) 44%, rgba(20,134,108,1) 100%);
	width: 300px; /* Adjust the width as needed */
	border: 1px solid #ddd;
	border-radius: 8px;
	margin: 20px;
	padding: 20px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
	transition: box-shadow 0.3s ease;
}

.product-image {
	max-width: 60%;
	height: auto;
	border: 1px solid #ddd;
	border-radius: 5px;
	height: auto;
}

.product-name {
	font-size: 18px;
	font-weight: bold;
	color: #333;
	margin-top: 10px;
}

.product-rating {
	color:red; /* Flipkart's orange color */
	font-size: 16px;
	margin-top: 5px;
	font-weight: bolder;
}

.product-price {
	color: #008000; /* Flipkart's green color */
	font-size: 18px;
	margin-top: 5px;
}

.star-icon::before {
    content: "\2605"; /* Unicode character for a solid star */
    margin-right: 5px; /* Adjust spacing between rating and star */
}
/* Optional: Add hover effect */
.grid-item:hover {
	box-shadow: 0 0 20px rgba(0, 0, 0, 0.2);
}
</style>
</head>
<body>
	<h2>Product Details</h2>

	<div class="2container">
		<h:panelGrid columns="1">
			<h:dataTable value="#{productController.showProducts()}"
				var="product" styleClass="grid-container">
				<h:column id="product-column">
					<div class="grid-item" id="product">
						<h:graphicImage value="#{product.imagePath}" alt="Product Image"
							styleClass="product-image" />
						<br />

						<h:outputLink
							value="#{productController.navigateToProductDetails()}">
							<h:outputText value="#{product.name}" styleClass="product-name" />
						</h:outputLink><br />

						<h:outputText value="Rating: #{product.rating}" styleClass="product-rating"/>
						<br />
						<h:outputText value="Price: #{product.price}"
							styleClass="product-price" />
					</div>
					<br />
				</h:column>
			</h:dataTable>
		</h:panelGrid>
	</div>
</body>
	</html>
</f:view>
