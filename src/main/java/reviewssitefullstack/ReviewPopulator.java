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
	@Resource TagRepository tagRepo;
	
	@Override
	public void run (String...args) throws Exception {
		Category anastasia = new Category("Anastasia");
		categoryRepo.save(anastasia);
		
		Category fentyBeauty = new Category ("Fenty Beauty");
		categoryRepo.save(fentyBeauty);
		
		Category tarte = new Category ("Tarte");
		categoryRepo.save(tarte);
		
		Tag eyebrows = new Tag("eyebrows");
		tagRepo.save(eyebrows);
		Tag face = new Tag("face");
		tagRepo.save(face);
		Tag lips = new Tag("lips");
		tagRepo.save(lips);
		
		reviewRepo.save(new Review ("Dip brow","Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n" + 
				"tempor incididunt ut labore et dolore magna aliqua.", "/images/anastasia.jpg",anastasia,eyebrows,face));
		reviewRepo.save(new Review("Foundation","Lorem ipsum dolor sit amet, consectetur adipisicing elit.","/images/anastasia.jpg",tarte,face));
		reviewRepo.save(new Review("Foundation","Lorem ipsum dolor sit amet, consectetur adipisicing elit.","/images/anastasia.jpg",tarte));
	}
	
}
