package reviewssitefullstack;
import javax.annotation.Resource;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReviewController {
	
		@Resource
		CategoryRepository categoryRepo;
		
		@Resource
		ReviewRepository reviewRepo;

		
		@RequestMapping("/reviews")
		public String getAllBooks (Model model) {
			model.addAttribute("reviews", reviewRepo.findAll());
			return "reviews";
		}
		
		@RequestMapping("/categories")
		public String getAllAuthors (Model model) {
			model.addAttribute("categories", categoryRepo.findAll());
			return "categories";
		}
		@RequestMapping("/review")
		public String getOneAuthor(@RequestParam Long id, Model model) {
			model.addAttribute("review", reviewRepo.findOne(id));
			return "review";
		}
		@RequestMapping("/category")
		public String getBooksByGenre(@RequestParam Long id, Model model) {
			model.addAttribute("category", categoryRepo.findOne(id));
			return "category";
		}
		
		
		
	}
