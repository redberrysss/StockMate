package com.portfolio.stockmate
import org.junit.Assert.assertEquals
import org.junit.Test
class StockMathTest { @Test fun inventoryValue_isQuantityTimesCost() { val product=Product(name="Test",sku="T",category="Test",quantity=3,cost=4.5,sellingPrice=8.0); assertEquals(13.5, product.quantity*product.cost, 0.0) } }
