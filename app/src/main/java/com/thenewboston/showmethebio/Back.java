package com.thenewboston.showmethebio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Back extends AppCompatActivity {
    private ImageView imageViewBackId;
    private TextView textViewBackId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_back);
        imageViewBackId =(ImageView) findViewById(R.id.imageViewBack2B);
        textViewBackId =(TextView) findViewById(R.id.textViewBack2B);
        textViewBackId.setText("EISENACH: 1685-1695\n" +
                "\n" +
                "Johann Sebastian Bach was born on March 21st l685, the son of Johann Ambrosius, court trumpeter for the Duke of Eisenach and director of the musicians of the town of Eisenach in Thuringia. For many years, members of the Bach family throughout Thuringia had held positions such as organists, town instrumentalists, or Cantors, and the family name enjoyed a wide reputation for musical talent.\n" +
                "\n" +
                "The family at Eisenach lived in a reasonably spacious home just above the town center, with rooms for apprentice musicians, and a large grain store. (The pleasant and informative \"Bach Haus\" Museum in Eisenach does not claim to be the original family home). Here young Johann Sebastian was taught by his father to play the violin and the harpsichord. He was also initiated into the art of organ playing by his famous uncle, Johann Christoph Bach, who was then organist at the Georgenkirche in Eisenach. Sebastian was a very willing pupil and soon became extraordinarily proficient with these instruments.\n" +
                "\n" +
                "When he was eight years old he went to the old Latin Grammar School, where Martin Luther had once been a pupil; he was taught reading and writing, Latin grammar, and a great deal of scripture, both in Latin and German. The boys of the school formed the choir of the St. Georgenkirche, which gave Johann Sebastian an opportunity to sing in the regular services, as well as in the nearby villages. He was described as having 'an uncommonly fine treble voice'. The Lutheran spirit would have been strong in Eisenach, for it was in the Wartburg Castle standing high above the town, that Martin Luther, in hiding from his persecutors, translated the New Testament into German.\n" +
                "\n" +
                "Roads were still unpaved in the smaller towns, sewage and refuse disposal poorly organized, and the existence of germs not yet scientifically discovered. Mortality rates were high as a result. At an early age Johann Sebastian lost a sister and later a brother. When he was only nine years old his mother died. Barely nine months later his father also died.\n" +
                "\n" +
                "Johann Sebastian and one of his brothers, Johann Jakob, were taken into the home of their eldest brother, Johann Christoph (born l671) who had recently married and settled down at Ohrdruf, a small town thirty miles south-east of Eisenach. Johann Christoph, a former pupil of Pachelbel, was now well established as organist of the St. Michaeliskirche, Ohrdruf.\n" +
                "\n" +
                "Return to top of page\n" +
                "\n" +
                "OHRDRUF: 1695-1700\n" +
                "\n" +
                "Johann Christoph was an excellent teacher - all of his five sons were to reach positions of some eminence in music, and he was a keen student of the latest keyboard compositions.\n" +
                "\n" +
                "Johann Sebastian at once settled down happily in this household studying the organ and harpsichord with great interest under his brother, and he quickly mastered all the pieces he had been given. When a new organ was installed at the Ohrdruf church, Christoph allowed his young brother to watch its construction. He also encouraged him to study composition and set Sebastian to copying music by German organist composers such as Jakob Froberger, Johann Caspar Kerll and Pachelbel. An anecdote tells how Christoph punished his young brother when he discovered he had copied a forbidden musical manuscript by moonlight over a period of six months, and confiscated the precious copy.\n" +
                "\n" +
                "During this period Johann Sebastian attended the Gymnasium (grammar school) of Ohrdruf, once a monastic foundation, which had become one of the most progressive schools in Germany. He made excellent progress in Latin, Greek and theology, and had reached the top form at a very early age. The scholars of the Gymnasium, as at Eisenach, were also employed as choir-boys, and their Cantor, Elias Herda, had a high opinion of Johann Sebastian's voice and musical capabilities.\n" +
                "\n" +
                "It was his excellent soprano voice that found Johann Sebastian a position in the choir of the wealthy Michaelis monastery at Lüneburg, which was known to provide a free place for boys who were poor but with musical talent. This was no doubt arranged by Elias Herda who had held a scholarship there himself.\n" +
                "\n" +
                "In the Spring of 1700 Johann Sebastian set out with his schoolfriend, Georg Erdmann, who was also joining the choir, on the journey of a hundred and eighty miles north to Lüneburg. It is not known how they traveled; most probably the journey would have been undertaken largely on foot, relieved where possible with a lift on a river barge or farmer's cart. Doubtless the two boys would have been given free food and accommodation in the many monasteries along the route.\n" +
                "\n" +
                "Return to top of page\n" +
                "\n" +
                "LÜNEBURG: 1700-1702\n" +
                "\n" +
                "When Johann Sebastian reached this North-German musical center, he was well received because of his uncommonly beautiful soprano voice, and was immediately appointed to the select body of singers who formed the 'Mettenchor' (Mattins Choir). Their obligations to sing were many, and Johann Sebastian thus had a unique chance to participate in choral and orchestral performances on a scale unknown in the poorer Thuringian towns of his homeland. He was also freely permitted to study the fine library of music in the Gymnasium, which included some of the best examples of German church music.\n" +
                "\n" +
                "The growing lad soon lost his soprano voice, but was able to make himself useful as a violinist in the orchestra, and as an accompanist at the harpsichord during choir rehearsals.\n" +
                "\n" +
                "During this period he was fortunate in meeting Georg Böhm, organist of the Johanniskirche at Lüneburg, who himself had been a pupil of the famous organist Jan Adams Reinken in Hamburg, and was a friend of the Bach family in Ohrdruf. Böhm introduced Johann Sebastian to the great organ traditions of Hamburg, to which city he made several pilgrimages on foot. He also came under the influence of French instrumental music when, through his great proficiency on the violin, he played at the Court of Celle, 50 miles south of Lüneburg. Though distinctly German in its construction and outer appearance, Celle Castle was known as a 'miniature Versailles' for its rich interiors and then-current musical tastes.\n" +
                "\n" +
                "When he was nearly eighteen, Johann Sebastian, considerably enriched by these musical experiences, decided he would try to find employment as an organist in his native Thuringia. He was greatly interested in an organ under construction in the new church of Arnstadt, and as members of his family had been professionally active in the district for generations, he felt he had a good chance of getting the post. So in 1702 he left Lüneburg and returned South.\n" +
                "\n" +
                "Return to top of page\n" +
                "\n" +
                "WEIMAR (first term): 1703.\n" +
                "\n" +
                "While awaiting the completion of the organ at Arnstadt, Sebastian was offered, and accepted the post of violinist in the small chamber orchestra of Duke Johann Ernst, the younger brother of the Duke of Weimar. At Lüneburg he had already experienced church choir music, violin, continuo and organ playing, as well as musical composition and performance in the French style. Here at Weimar he now came into contact with Italian instrumental music, and acted as deputy to the aging Court Organist, Effler, an old friend of the Bach family, thus having a chance to keep his organ playing in practice. His stay here was short, but he was to return later.\n" +
                "\n" +
                "In July 1703 the Arnstadt Town Council invited young Bach to try out the newly finished organ in the 'New Church', so called as it had been almost totally rebuilt having been seriously damaged by fire. He so impressed the people of Arnstadt with his brilliant playing at the dedication that he was immediately offered the post of organist on very favorable terms.\n" +
                "\n" +
                "Return to top of page\n" +
                "\n" +
                "ARNSTADT: 1703-1707\n" +
                "\n" +
                "At the end of 1703, 18-year-old Sebastian took up his post at the small town of Arnstadt, no doubt thrilled at having his own relatively large organ of two manuals and 23 speaking stops, and the responsibility of providing music for his own congregation. Though the present organ is not \"Bach's\", the original manuals, stops and pedals of Bach's organ are displayed in the Palm Haus Museum of this quiet historic little town, where the house in which Bach lodged can also be seen.\n" +
                "\n" +
                "In October 1705, the Church Council granted Bach leave to visit the north-German city of Lübeck to hear the great organist, Dietrich Buxtehude. In Lübeck he took every chance to hear Buxtehude play, and to attend the famous evening concerts in the Marienkirche when Buxtehude's church cantatas were performed. Bach was so fascinated by these concerts, and by his discussions on the arts with the great master, that he remained in Lübeck over Christmas until the following February.\n" +
                "\n" +
                "He returned to Arnstadt three months late, having also visited Reincken in Hamburg and Böhm in Lüneburg on the way, full of new ideas and enthusiasm which he immediately put into practice in his playing. The congregation however was completely surprised and bewildered by his new musical ideas: there was considerable confusion during the singing of the chorales, caused by his \"surprising variations and irrelevant ornaments which obliterate the melody and confuse the congregation\".\n" +
                "\n" +
                "The Church Council resolved to reprimand Bach on his 'strange sounds' during the services, and they also asked him to explain the unauthorized extension of his leave in Lübeck. Bach did not attempt to justify himself before what must have seemed to him a group of narrow minded and conservative old gentlemen; yet the Council, knowing how skilled his playing was, decided to treat their young and impetuous organist with leniency.\n" +
                "\n" +
                "However, new conflicts soon arose when Bach, citing a clause in his contract, refused to work any longer with the undisciplined boys' choir which he had been required to train for the sake of Council economy. For this the Council further reprimanded him and also added the complaint that he had been \"entertaining a strange damsel\" to music in organ loft of the church. The young lady was probably his cousin, Maria Barbara, whom he was later to marry.\n" +
                "\n" +
                "Thus, what had been an exciting and promising start at Arnstadt, had now turned into recriminations and disputes; Bach no doubt decided it would be better to look around for somewhere new.\n" +
                "\n" +
                "At the end of 1706, he heard that the organist to the town of Mühlhausen had died. Knowing that Mühlhausen had a long musical tradition, he applied for the post, and after yet another very successful audition at the imposing cathedral-like St Blasius Church on Easter Sunday 1707, he was accepted, again on very favorable terms. So in June 1707 he returned the keys of his office to the Arnstadt Council and left quietly with his few belongings for Mühlhausen.\n" +
                "\n" +
                "Return to top of page\n" +
                "\n" +
                "MÜHLHAUSEN: 1707-1708\n" +
                "\n" +
                "Bach arrived at Mühlhausen, a small Thuringian town proud of its ancient foundation and independence, to take up the post of organist to the town. Unfortunately, a quarter of the whole town had recently been devastated by fire; it was difficult for him to find suitable dwellings, and he was thus forced to pay a high rent. Nevertheless, shortly after his arrival, he brought his cousin Maria Barbara from Arnstadt, and on October 17th 1707 he married her at the small church in the picturesque little village of Dornheim. Maria Barbara came of a branch of the musical Bach family, her father being organist at Gehren.\n" +
                "\n" +
                "By now Bach had high ideals for the church music of Germany, and to start with, he began organizing the rather poor facilities of Mühlhausen; he began by making a large collection of the best German music available, including some of his own, and set about training the choir and a newly created orchestra to play the music.\n" +
                "\n" +
                "The first result of these efforts was his cantata 'Gott ist mein König' (BWV 71), given in hitherto unknown splendor in the spacious Marienkirche to celebrate the inauguration of the Town Council in February 1708. This success gave Bach the courage to put in a long and detailed report, proposing a complete renovation and improvement of the organ in the St Blasiuskirche. The Council agreed to carry out the renovation and improvements, and Bach was given the task of supervising the work, for not only was he now a brilliant player, he had also become an expert on the construction of organs.\n" +
                "\n" +
                "However, before the organ was completed, a religious controversy arose in Mühlhausen between the orthodox Lutherans, who were lovers of music, and the Pietists, who were strict puritans and distrusted art and music. Bach was apprehensive of the latter's growing influence, in addition to the fact that his immediate superior was a Pietist. Music in Mühlhausen seemed to be in a state of decay, and so once more he looked around for more promising possibilities.\n" +
                "\n" +
                "Former contacts made in Weimar were now useful; the Duke of Weimar offered him a post among his Court chamber musicians, and on June 25, 1708, Bach sent in his letter of resignation to the authorities at Mühlhausen, stating very diplomatically that not only was he finding it difficult to keep a wife on the small salary agreed to on his arrival, but that he could see no chance of realizing his final aim, namely the establishment of a proper church music 'to the glory of God'. The Council had little option but to allow his departure. However, the situation was concluded quite amicably and Bach was asked that he should continue to supervise the rebuilding of the St Blasiuskirche organ. This he did, and some time in 1709 he came over to inaugurate its first performance.\n" +
                "\n" +
                "Return to top of page");

        imageViewBackId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentY = new Intent(Back.this ,MainActivity.class);
                startActivity(intentY);
            }
        });
    }
}
