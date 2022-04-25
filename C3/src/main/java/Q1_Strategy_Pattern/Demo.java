package Q1_Strategy_Pattern;

public class Demo {
	public static void main(String[] args) {
// any social media strategy.
		SocialMediaContext context = new SocialMediaContext();
// Setting Facebook strategy.
		context.setStrategy(new FacebookStrategy());
		context.connect("Lokesh");
// Setting Twitter strategy.
		context.setStrategy(new TwitterStrategy());
		context.connect("Lokesh");
// Setting GooglePlus strategy.
		context.setStrategy(new GooglePlusStrategy());
		context.connect("Lokesh");
// Setting Orkut strategy.
		context.setStrategy(new OrkutStrategy());
		context.connect("Lokesh");
	}
}
