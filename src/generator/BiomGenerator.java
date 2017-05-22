package generator;

import java.util.ArrayList;
import java.util.List;

import blocks.Block;
import creatures.Creatures;
import frameWork.Generator;

public class BiomGenerator {
	 private List<Generator<Block>> BlockGenerator = new ArrayList<>();
	  private List<Generator<Creatures>> CreatureGenerator = new ArrayList<>();
}
