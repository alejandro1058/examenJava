package mx.com.exam.service;

import mx.com.exam.dto.ProductoDTO;
import mx.com.exam.model.Producto;
import mx.com.exam.respository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {
    @Autowired
    private ProductoRepository productoRepository;

    public List<Producto> getProducts() {
      return productoRepository.findAll();
    }
    public Producto getProductById(Long id) {
        return  productoRepository.findById(id).get();
    }

    public String addProduct(Producto producto) {
       productoRepository.save(producto);
       return "Guardado";
    }

    public String updateProduct(Long id, Producto producto) {
        Producto productToUpdate = productoRepository.findById(id).get();
        productToUpdate.setNombre(producto.getNombre());
        productToUpdate.setPrecio(producto.getPrecio());
        productoRepository.save(productToUpdate);
        return "Actualizado";
    }
    public String deleteProduct(Long id) {
        Producto productToDelete =  productoRepository.findById(id).get();
        productoRepository.delete(productToDelete);
        return "Borrado Correctamente";
    }
}
