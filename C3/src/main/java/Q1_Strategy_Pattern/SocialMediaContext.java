package Q1_Strategy_Pattern;

public class SocialMediaContext {
  Strategy strategy;

public Strategy getStrategy() {
	return strategy;
}

public void setStrategy(Strategy strategy) {
	this.strategy = strategy;
}
  
public void connect(String name) {
	strategy.connect(name);
}
  
}
