package dv.android.com.customrecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<CharacterDTO> dataList;
    private RecyclerView recycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataList = new ArrayList<>();
        recycler = findViewById(R.id.recyclerId);
        recycler.setLayoutManager(new LinearLayoutManager(this));

        loadCharacters();

        CharacterAdapter adapter = new CharacterAdapter(dataList);
        recycler.setAdapter(adapter);
    }

    private void loadCharacters(){
        dataList.add(new CharacterDTO("Lion", "The lion (Panthera leo) is a species in the family Felidae; it is a muscular, deep-chested cat with a short, rounded head, a reduced neck and round ears, and a hairy tuft at the end of its tail.", R.drawable.lion));
        dataList.add(new CharacterDTO("Turtle", "Turtles are diapsids of the order Testudines (or Chelonii[3]) characterized by a special bony or cartilaginous shell developed from their ribs and acting as a shield.[4] \"Turtle\" may refer to the order as a whole (American English) or to fresh-water and sea-dwelling testudines (British English).", R.drawable.turtle));
        dataList.add(new CharacterDTO("Bear", "Bears are carnivoran mammals of the family Ursidae. They are classified as caniforms, or doglike carnivorans. Although only eight species of bears are extant, they are widespread, appearing in a wide variety of habitats throughout the Northern Hemisphere and partially in the Southern Hemisphere.", R.drawable.bear));
        dataList.add(new CharacterDTO("Wolf", "The wolf (Canis lupus),[a] also known as the gray/grey wolf, timber wolf,[4][5] or tundra wolf, is a canine native to the wilderness and remote areas of Eurasia and North America.", R.drawable.wolf));
        dataList.add(new CharacterDTO("Cock", "A rooster, also known as a cockerel or cock, is a male gallinaceous bird, with cockerel being younger and rooster being an adult male chicken (Gallus gallus domesticus).", R.drawable.cock));
        dataList.add(new CharacterDTO("Dog", "The domestic dog (Canis lupus familiaris when considered a subspecies of the wolf or Canis familiaris when considered a distinct species)[5] is a member of the genus Canis (canines), which forms part of the wolf-like canids.", R.drawable.dog));
        dataList.add(new CharacterDTO("Horse", "The horse (Equus ferus caballus)[2][3] is one of two extant subspecies of Equus ferus. It is an odd-toed ungulate mammal belonging to the taxonomic family Equidae.", R.drawable.horse));
        dataList.add(new CharacterDTO("Fox", "Foxes are small-to-medium-sized, omnivorous mammals belonging to several genera of the family Canidae. Foxes have a flattened skull, upright triangular ears, a pointed, slightly upturned snout, and a long bushy tail (or brush).", R.drawable.fox));
        dataList.add(new CharacterDTO("Rhinoceros", "A rhinoceros (/raɪˈnɒsərəs/, from Greek rhinokerōs, meaning 'nose-horned', from rhis, meaning 'nose', and keras, meaning 'horn'), commonly abbreviated to rhino, is one of any five extant species of odd-toed ungulates in the family Rhinocerotidae.", R.drawable.rhinoceros));
        dataList.add(new CharacterDTO("cat", "The cat (Felis catus) is a small carnivorous mammal.[1][2] It is the only domesticated species in the family Felidae and often referred to as the domestic cat to distinguish it from wild members of the family.", R.drawable.cat));
    }
}
