package recap.spring_easy_exercises.exercise07;

import com.wantsome.layered.domain_dao.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return Collections.emptyList();
    }
}

//daca nu adaugam nimic in RestController ca si valoare pt path sau in request mapping, path-ul nostru final va fi /products. Daca adaugam in una din cele 2 annotari un path, se vor
//concatena, rezultand in ceva de genul /api/products.
