package frameWork;

import java.util.ArrayList;
import java.util.List;

import blocks.Block;
import creatures.Creatures;

public class World {
	  private List<Generator<Block>> BlockGenerator = new ArrayList<>();
	  private List<Generator<Creatures>> CreatureGenerator = new ArrayList<>();
}
