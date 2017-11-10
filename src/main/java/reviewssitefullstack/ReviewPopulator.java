package reviewssitefullstack;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ReviewPopulator implements CommandLineRunner{

	@Resource
	private ReviewRepository reviewRepo;
	@Resource
	private CategoryRepository categoryRepo; 
	
	@Override
	public void run (String...args) throws Exception {
		Category anastasia = new Category("Anastasia");
		categoryRepo.save(anastasia);
		
		Category fentyBeauty = new Category ("Fenty Beauty");
		categoryRepo.save(fentyBeauty);
		
		Category tarte = new Category ("Tarte");
		categoryRepo.save(tarte);
		
		reviewRepo.save(new Review ("Dip brow","Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n" + 
				"tempor incididunt ut labore et dolore magna aliqua.", "",anastasia));
		reviewRepo.save(new Review("Foundation","Lorem ipsum dolor sit amet, consectetur adipisicing elit.","",tarte));
	}
	
}
