package mx.com.exam.controller;

import mx.com.exam.model.Producto;
import mx.com.exam.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("producto/v1/")
public class ProductosController {
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listarProductos")
    public List<Producto> listProducts() {
        return productoService.getProducts();
    }
    @GetMapping("/obtenerProducto/{id}")
    public Producto getProduct(@PathVariable Long id) {
        return productoService.getProductById(id);
    }

    @PostMapping("/agregarProducto")
    public String addProduct(@RequestBody Producto producto) {
        return productoService.addProduct(producto);
    }
    @PutMapping("/modificarProducto/{id}")
    public String updateProduct(@PathVariable Long id, @RequestBody Producto producto) {
        return  productoService.updateProduct(id, producto);
    }
    @DeleteMapping("/borrarProducto/{id}")
    public String deleteProduct(@PathVariable Long id) {
        return productoService.deleteProduct(id);
    }
}
