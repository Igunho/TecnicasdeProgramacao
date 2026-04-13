package br.edu.fatecpg.cadastrarprodutos.controller;

import br.edu.fatecpg.cadastrarprodutos.model.Produto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProdutoController {
    private static final List<Produto> produtos = new ArrayList<>();

    @GetMapping("/")
    public String index() {
        return "redirect:/cadastrar";
    }

    @GetMapping("/cadastrar")
    public String cadastrar(Model model) {
        model.addAttribute("produto", new Produto());
        return "cadastrar";
    }

    @PostMapping("/cadastrar")
    public String cadastrarproduto(@ModelAttribute Produto produto, Model model) {
        if (produto.getPreco() > 0) {
            produtos.add(produto);
            return "redirect:/lista";
        } else {
            model.addAttribute("erro", "PREÇO NÃO PODE SER NEGATIVO");
            return "cadastrar";
        }
    }

    @GetMapping("/lista")
    public String exibirlista(Model model) {
        model.addAttribute("produtos", produtos);
        return "lista";
    }

    @PostMapping("/lista")
    public String removerproduto (@ModelAttribute Produto produto) {
        produtos.remove(produto);
        return "redirect:/lista";
    }
}
