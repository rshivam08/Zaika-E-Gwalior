package com.iiitm.android.zaika_e_gwalior;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class Main12Activity extends AppCompatActivity {


    public List<AdapterHindiHistorical> adapterhistoricalList = new ArrayList<>();
    Context mcontext;
    MovieAdapterHindiHis movieAdapterhistorical;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);


        Toolbar toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("ऐतिहासिक जगह ");

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        movieAdapterhistorical = new MovieAdapterHindiHis(adapterhistoricalList,this);
        recyclerView.setAdapter(movieAdapterhistorical);


        prepareMovieData();
    }

    private void prepareMovieData() {

        int[] covers = new int[]{
                R.drawable.fort,
                R.drawable.jaivilashpalace,
                R.drawable.gopa,
                R.drawable.mansingh,
                R.drawable.sbt,
                R.drawable.skund,
                R.drawable.syndhiya,
                R.drawable.gujrimus,
                R.drawable.tombgauss, R.drawable.karan, R.drawable.jahagir, R.drawable.jauhar, R.drawable.moti,
                R.drawable.bhimsinghrana,  R.drawable.hamam,
                R.drawable.vikram1, R.drawable.jhansikirani, R.drawable.jhilmil,R.drawable.pichor,
                R.drawable.kila_behatt,R.drawable.atchatu,
                R.drawable.mitawli, R.drawable.padavli, R.drawable.bateshwer,
                R.drawable.dhume,R.drawable.behattt,
                R.drawable.rasslela,
                R.drawable.lathedi_gate

        };


        AdapterHindiHistorical a = new AdapterHindiHistorical(covers[0], "ग्वालियर किला ", "ग्वालियर (म.प्रदेश)", "09:00 am- 06:00 pm",
                "ग्वालियर का क़िला ग्वालियर शहर का प्रमुखतम स्मारक है। यह किला गोपांचल नामक पर्वत पर स्थित है। किले के पहले राजा का नाम सूरज सेन था, जिनके नाम का प्राचीन 'सूरज कुण्ड' किले पर स्थित है। ग्वालियर का किला कोई १८०० साल के करीब पहले से बनना शुरू हो गया था | इसे लगभग १८० राजाओं, १० प्रतिहारों सहित १३ तोमर वंश के राजाओं , गोहद के राणा , 4 मुग़ल बादशाहों सहित लगभग १८० शासकों द्वारा इसे बनाने का गौरव हासिल हुआ था | एस किले का ताज राजा मानसिंह तोमर (१४८६-१५१) के मान मंदिर महल को कहा जाता है | इसके बारे में  सितम्बर १५२६ में मुग़ल बादशाह जहीरुद्दीन मुहम्मद बाबर ने भी अपनी प्रसिद्ध पुस्तक बाबरनामा में काफी तारीफ लिखी हैं | बाबर ७ दिन एस महल में २ बार  ठहर चुके थे |लाल बलुए पत्थर से बना यह किला शहर की हर दिशा से दिखाई देता है। एक ऊंचे पठार पर बने इस किले तक पहुंचने के लिये दो रास्ते हैं। एक ग्वालियर गेट कहलाता है एवं इस रास्ते सिर्फ पैदल चढा जा सकता है। गाडियां ऊरवाई गेट नामक रास्ते से चढ सकती हैं और यहां एक बेहद ऊंची चढाई वाली पतली सड़क से होकर जाना होता है। इस सडक़ के आर्सपास की बडी-बडी चट्टानों पर जैन तीर्थकंरों की अतिविशाल मूर्तियां बेहद खूबसूरती से और बारीकी से गढी गई हैं। किले की तीन सौ पचास फीट उंचाई इस किले के अविजित होने की गवाह है। ", "Gwalior fort, Gwalior, Madhya Pradesh, 474001, India", "8 वी शादी में महाराजा  मानसिंघ के द्वारा बांया गया.", "बच्चे-40 Rs/व्यक्ति,वयस्क-75 Rs/व्यक्ति, विदेशी -250 Rs/व्यक्ति", "75140407777");
        adapterhistoricalList.add(a);


       a = new AdapterHindiHistorical(covers[1], "जय विलास पैलेश ", "लश्कर, ग्वालियर ", "10:00 am - 4:45 pm",
                "जय विलास पैलेश यूरोपियन आर्किटेक्चर के यह एक उत्तम उदाहरण है, जिसे निर्माण सर माइकल फिलोसे ने किया था। पैलेस बहुत सी आर्किटेक्चरल शैलियों का मिश्रण है, जिसकी पहली मंजिल टस्कन, दूसरी इटालियन-डोरिक और तीसरी कोरिंथियन शैली में बनी हुई है। जय विलास पैलेस शाही सिंदिया परिवार के लोगो का घर हुआ करता था। जय विलास पैलेस के कुछ भाग को बाद में राजमाता श्रीमंत विजयराजे सिन्दियाँ ने म्यूजियम में परिवर्तित कर दिया था। यह सब कुछ श्रीमंत जीवाजीराव सिंदिया की याद में किया गया था। इसके बाद डॉ. सर्वपल्ली राधाकृष्णन, भारत के राष्ट्रपति ने भी एच.एच. महाराजा जीवाजीराव सिंदिया म्यूजियम की स्थापना 12 दिसम्बर 1964 को की थी। ", "Jai Vilas Palace,Gwalior 474001", "इसका निर्माण सदियों पहले 1874 में महाराजा जयाजिराव सिंदिया ने करवाया था।", "60 Rs/व्यक्ति", "9301107666");
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[2], "गोपाचल पर्वत", "लश्कर, ग्वालियर ", "10:00 am - 07:00 pm",
                "ग्वालियर किले के अंचल में गोपाचल पर्वत है, जहां प्राचीन जैन मूर्ति समूह का अद्वितीय स्थान है| गोपालल पर्वत को \"यक पाथर की बावरी\" के नाम से भी जाना जाता है ग्वालियर में जाने के लिए एक अच्छी जगह है। जैन तीर्थंकरों की भव्य मूर्तियों की संख्या बहुत अधिक है। वे संख्या में 26 हैं। इन निर्माणों को तोमर शासकों, विशेष रूप से वीरम देव, दोओंगर सिंह और कीर्ती सिंह में 1398 और 1536 के बीच श्रेय दिया जाता है। ये मूर्तियां अहिंसा का संदेश दुनिया को देती हैं और हिंदुओं को उनकी पूजा में बलिदान देने से दूर रखने का प्रचार करती हैं। जैन तेरथांकरास के ये विशाल मूर्तियां सभी को अंधविश्वासी विश्वासों और अनावश्यक जटिल अनुष्ठानों का पालन करने से दूर रहने के लिए प्रचार करते हैं।"," Lashkar, Gwalior, Madhya Pradesh 474002", "तोमर राजा - वीरमदेव, डुंगर सिंह और किर्ती सिंह के शासनकाल के दौरान बनाया गया","बच्चे-40 Rs/व्यक्ति,वयस्क-75 Rs/व्यक्ति, विदेशी -250 Rs/व्यक्ति", "0751 243 3400" );

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[3], "मानसिंह महल","ग्वालियर (म.प्रदेश)", "10:00 am- 06:00 pm",
                "मानसिंह महल मध्य प्रदेश राज्य  के ग्वालियर शहर में स्थित है। इसका निर्माण 1486 से 1517 ई. के बीच राजा मानसिंह द्वारा करवाया गया था। यह महल ऐतिहासिक महत्त्व का स्थान है। इससे कई हृदयस्पर्शी कहानियाँ भी जुड़ी हुई हैं। यह हिन्दू वास्तुकला के साथ मिश्रित मध्ययुगीन वास्तुकला का अच्छा उदाहरण है। इस संरचना में चार मंजिलें हैं, जिसमें से दो मंजिलें भूमिगत हैं। इस क़िले के विशाल कक्षों में अतीत आज भी स्पंदित है। यहां जालीदार दीवारों से बना संगीत कक्ष है, जिनके पीछे बने जनाना कक्षों में राज परिवार की स्त्रियां संगीत सभाओं का आनंद लेतीं और संगीत सीखतीं थीं। इस महल के तहखानों में एक कैदखाना है, इतिहास कहता है कि मुग़ल बादशाह औरंगज़ेब ने यहां अपने भाई मुराद को कैद करके रखवाया था और बाद में उसे समाप्त करवा दिया।", "पुरातत्व संग्रहालय फोर्ट कैम्पस के पास,ग्वालियर 474001", "1486 और 1516 के बीच तोमर शासक मानव सिंह द्वारा निर्मित है|", "100 Rs/व्यक्ति", "18002337777");
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[4], "सहस्त्र बाहु मंदिर", "ग्वालियर किला ", "05:00 am- 09:00 pm",
                "अपने मनोहारी सौंदर्य के लिए विख्यात, ‘सहस्त्रबाहु मंदिर’ मध्य प्रदेश के ग्वालियर शहर में ग्वालियर किले की पूर्वी दिशा में स्थित है। यह 32 मीटर लंबा और 22 मीटर चौड़ा मंदिर तीन विभिन्न दिशाओं में खुलता है और इसके स्थापत्य में ख़ूबसूरत नक्काशी तथा अद्भुत शिल्पकला की समृद्ध झलक देखने को मिलती है। इसके अतिरिक्त, मंदिर के मुख्य प्रवेश द्वार के ठीक ऊपर भगवान् ब्रह्मा, विष्णु और देवी सरस्वती की सुंदर मूर्तियाँ स्थापित हैं। कहा जाता है कि इस अनूठे मंदिर का निर्माण सन् 1092 में कच्छवाहा वंश के राजा महिपाल ने करवाया था। एक दूसरे से सटकर बने हुए दो मंदिरों के एकल रूप, इस जुड़वां मंदिर का एक हिस्सा मूल रूप से भगवान् विष्णु और दूसरा भगवान् शिव को समर्पित था। इस मंदिर की सबसे बड़ी ख़ासियत है इसकी मनोरम वास्तुकला, जो इसे व्यापक रूप से लोकप्रिय बनाती है और जिसे देखकर हर कोई विस्मित हो जाता है। इस मंदिर से जुड़ी एक और ख़ास बात जो श्रद्धालुओं और पर्यटकों को अपनी ओर खींचती है, वो है इस अद्भुत मंदिर का अनूठा और लोकप्रिय नाम “सास-बहू मंदिर” |", "डाकघर के पास फोर्ट कैम्पस,ग्वालियर 474001 ","कच्छापघटा वंश के राजा महापाल द्वारा 10 9 0 में निर्मित", "60 Rs/व्यक्ति", "9781576646" );
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[5],"सुरजकुण्ड", "ग्वालियर (म.प्रदेश)", "08:00 am- 06:00 pm",
                "सूरज कुंड एक सुंदर तालाब है जो ग्वालियर किले के पास स्थित है। इसे 8 वीं शताब्दी के राजा सूरज सेन की लोक कथाओं के कारण महत्वपूर्ण स्थान प्राप्त हुआ है। जल स्त्रोत के तौर पर इसका उपयोग किया जाता है | यह लगभग १०० फीट गहरा है | इसके अंदर जाने के लिए सीढियाँ बनी है| कहा जाता है कि राजा को कुष्ठ रोग हो गया था और सौभाग्य से वे किले के पास ग्वालिपा नाम के साधू से मिले। साधू ने राजा से तालाब का कुछ पानी पीने के लिए कहा। राजा ने वैसा ही किया और राजा का कुष्ठ रोग ठीक हो गया। राजा ने साधू के नाम पर शहर का नाम ग्वालिपा रखा और उसके बाद से यह शहर ग्वालियर कहलाया जाने लगा। सूरज कुंड का नाम राजा के नाम पर पड़ा है और यह प्राचीन कहानी का वर्णन करता है।तालाब का सुंदर परिसर और कहानियां इसे एक आकर्षक पर्यटन स्थल बनाता है।","ग्वालियर फोर्ट कैम्पस, ग्वालियर 474001","सूरज सेन राजकुमार की याद में 15 वीं सदी में निर्मित","बच्चे-40 Rs/व्यक्ति,वयस्क-75 Rs/व्यक्ति, विदेशी -250 Rs/व्यक्ति" ,"7514040777");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[6], "सिंधिया म्यूजियम","लश्कर, ग्वालियर ", "10:00 am - 05:00 pm",
                "ग्वालियर के सबसे लोकप्रिय पर्यटक आकर्षणों में से एक, सिंधिया म्यूजियम संग्रहालय को 1874 में महाराजा जयाजी राव सिंधिया द्वारा बनाया गया था और इसकी लागत 1 करोड़ रूपए थी। मूल रूप से एक महल के रूप में बनाया गया था, अब इसे एक संग्रहालय में बदल दिया गया है। उन समय के एक लोकप्रिय आर्किटेक्ट सर माइकल फिलोस ने डिजाइन किया है, संरचना एक शानदार यूरोपीय वास्तुकला का एक उदाहरण है जिसे पहली मंजिल टस्कन के साथ बनाया गया है, दूसरी शैली में इटालियन-डोरीक और स्थापत्य शैली में तीसरे कोर्तिशियन। 12, 40, 771 वर्ग फुट के क्षेत्र में फैले हुए महल में एक विशाल दरबार हॉल है, जो खूबसूरत झूमर, गिल्ट और सोना सामान और एक विशाल कालीन के साथ खूबसूरती से सुसज्जित है। हॉल में झूमर और सोने के पत्ते दुनिया के सबसे बड़े हैं। सिल्वर ट्रेन के साथ एक विशाल खाने की मेज है, एक आकर्षण है। यह मिनी ट्रेन एक टेबल ट्राली है जो स्वयं को खाने वालों के सामने टेबल पर घूमती है ताकि वे भोजन चुन सकें|"," Lashkar, Gwalior, Madhya Pradesh 474009"," 1874 में महाराजा जयजीराव द्वारा निर्मित ", "100 Rs/व्यक्ति", "7512372390");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[7], "गुजरी महल ","लोहामंडी ग्वालियर ", "10:00 am - 05:00 pm",
                "ग्वालियर में स्थित गुजरी महल भारत के प्रसिद्ध पुरातात्विक संग्रहालयों में से एक है। यह इमारत वास्तविक रूप से एक महल थी जिसका निर्माण राजा मान सिंह ने अपनी पत्नी मृगनयनी के लिए करवाया था जो एक गूजर थी। अत: इस महल का नाम गुजरी महल पड़ा। वर्ष 1922 में पुरातात्विक विभाग द्वारा इसे एक संग्रहालय में बदल दिया गया। इस किले के 6 दरवाजे भी खास है जिसमें दूसरा दरवाजा उपनगर ग्वालियर से आने पर आलमगीर दरवाजा है , तीसरा बादलगढ़ दरवाजा जो गुजरी महल म्यूजियम में जाने का भी गेट है | फिर ३ साधारण दरवाजे हैं व छटा दरवाजा हथियापौर दरवजा की नक्काशी व पत्थरों का कटाव देखते ही बनता हैं | गुजरी महल संग्रहालय की मूर्तियों में प्रसिद्ध शालाभंजिक यक्षी, त्रिमूर्ति नटराज अर्धनारेश्वर और यमराज शामिल हैं। यहाँ शहर के मधु और धार क्षेत्र के फोटोग्राफ भी हैं जो 75 वर्ष पुराने हैं। यहाँ 15 वीं शताब्दी के महान संगीतकार तानसेन के जीवन से संबंधित प्रमाण भी हैं। किसी भी भारतीय इतिहासकार या इतिहास प्रेमी को इस संग्रहालय की सैर अवश्य करनी चाहिए। ","लोहामंडी,ग्वालियर 474008 ", "यह मानसिंह शासन के दौरान बनाया गया था", "10 Rs/व्यक्ति\n" + "50 Rs कैमरा के लिए", "08985869526");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[8], "मोहम्मद गौस का मकबरा ","तानसेन नगर, ग्वालियर","09:00 am - 06:00 pm",
                "मुस्लिम गुरू और हिंदू शिष्य के अनूठे प्रेम का प्रतीक हजीरा स्थित मोहम्मद गौस का मकबरा दुनिया का एकमात्र ऐसा एेतिहासिक स्मारक है जहां देश- विदेश के गायक व संगीतकार मन्नत मांगने आते हैं। सूफी संत मोहम्मद गौस का मकबरा मुगल सम्राट अकबर ने सन् 1666 में बनवाया था। उनके शिष्य तानसेन का स्मारक भी यहीं बना है। यहां से हर साल तानसेन समारोह की शुरूआत होती है। देश- विदेश के पर्यटक भी यहां सालभर आते रहते हैं। गौस के मकबरे का निर्माण सम्राट अकबर ने सन् 1606 में कराया। यह स्मारक मुगल शैली का है। इसमें परशियन, इस्लामिक व भारतीय तीनों तरह का स्थापत्य देखने को मिलता है।  स्मारक में बलुआ पत्थरों का प्रयोग किया गया है। यह 200x200 वर्गफीट आकार का चौकोर भवन है। इसके मध्यभाग में एक विशाल कक्ष है, जिसके बीच में मोहम्मद गौस का मजार है। इस कक्ष के ऊपरी भाग में एक विशाल अर्ध गोलाकार गुम्बद बना हुआ है, जो कभी नीले रंग की टाइलों से ढका हुआ था। विशाल कक्ष के चारों ओर सुंदर पत्थर की जालियों से ढकी नक्काशीदार मेहराबें हैं। इसकी छत पर मुगलकालीन चित्रकला की गई है। भवन के चारों कोनों पर तीन मंजिलें मेहराबों वाली मीनारें बनी हुई हैं।" ,"तानसेन नगर, ग्वालियर 474002", "जब बाबर ने 1526 में ग्वालियर के किले पर विजय प्राप्त की थी, तब इसे सहायता मिली।", "Not Available", "7512234557");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[9], "कर्ण महल", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                 "तोमर राजपूत ने ग्वालियर को 1194 एडी में कब्जा कर लिया और विरमदेव, उद्धरण देव, वीरमदेव, गणपतिदेव, दुग्रेन्द्र सिंह और कीर्ति सिंह द्वारा शासित। किर्ति सिंह के काल (1480-1486 ए.डि.) के दौरान कर्ण महल का निर्माण हुआ था। दो संग्रहीत पैलेस स्क्वायर प्लान पर बनाया गया था और एक तरफ 200 फीट मापा गया था। महल हिंदू वास्तुकला का सबसे अच्छा स्पेलिमान है। महल के भूतल पर हनम नाम के महिला स्नानगृहों की पूरी व्यवस्था है ये दूसरी मंजिल और छतों जाने के लिए कदम की एक उड़ान हैं महल के अंदर एक बड़े विधानसभा कक्ष है|","ग्वालियर क़िला, ग्वालियर 474001", "1480-1486 ए.डी. की अवधि के दौरान कृति सिंह द्वारा ","Not Available", "075140407777");

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[10],"जहांगीर-शाहजहाँ महल", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "यह महल करण महल के सामने स्थित है, जिसमें जांगीर महल और शाहजहाँ महल के अंदर है। बाद में मुगल द्वारा एक जेल के रूप में इस्तेमाल किया जाने वाला एक उल्लेखनीय उच्च दीवारों वाली इमारत। जहांगीरी महल के मार्ग पर नौ अंधेरे कोशिकाएं हैं और यह कहा जाता है कि इसे शेर द्वारा निर्माण के कारण शेर मंदिर के रूप में जाना जाता था और बाद में मोगल नियमों द्वारा पुनर्निर्मित किया गया जहांगीर और शाहजहां जहांगीरी महल का एक महल अनगिनत वास्तुकला में 320 × 170 फीट मापा, शाहजहां ने बनाया था। इसमें मुगल शैली का आकर्षक सजावट है|","ग्वालियर क़िला, ग्वालियर 474001", "शेरशाह द्वारा निर्मित ",  "Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[11], "जौहर कुंड", "लश्कर, ग्वालियर ", "09:00 am - 06:00 pm",
                "ग्वालियर किले के अंदर स्थानों और मंदिर के बगल में कई पानी के टैंक बनाए गए थे। किले के अंदर रहने वाले लोगों के लिए सूरज कुंड, मैन सरोवर ताल, गंगोला ताल, एक ख़भताल, रानीत, चेरताल और जौहर कुंड हैं, जो पानी का मुख्य स्रोत थे। 1232 ई डी में इल्तुतमीस के हमले के समय इस टैंक में राजपूत महिलाओं ने आत्महत्या की। ","ग्वालियर फोर्ट, ग्वालियर 474001", "जब बाबर ने 1526 में ग्वालियर के किले पर विजय प्राप्त की थी, तब इसे बनवाया गया ।\n", "Not Available", "075140407777");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[12], " मोतीमहल","लश्कर, ग्वालियर ", "09:00 am - 06:00 pm",
                "मोती महल का निर्माण 1827 ई.पू. में महाराजा जयाजी रवि शैक्षणिक या ग्वालियर स्टेटी ने किया था। बड़ा महल ग्वालियर डिवीजन के आयुक्त नियुक्त कार्यालय के अधीन मोती महल हैं, भारत के नियंत्रण कक्ष के असेंबली कक्ष, मीटिंग हॉल। डिप्टी द्वारा संरक्षित सुरक्षित कमरे हैं। एम.पी. का राज्य पुरातत्व दशा त्योहार का एक समारोह दिखाते हुए सुंदर रागम चित्रों हैं, बैठक कक्ष की दीवारों पर राधा-कृष्ण के आकर्षक चित्र हैं।", "मोतीमहल रोड लश्कर, ग्वालियर 474007","1827 ई.पू. में महाराजा जयाजी रवि विज्ञान द्वारा निर्मित", "Not Available", "07512424125");

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[13], "हमाम खाणा गढ़","ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                 "यह स्मारक ग्वालियर किले के निकट पश्चिम प्रवेश द्वार के तट के दायरे में स्थित है। पूर्व में यह हमाम खाना में 3 फ़र्श हैं। निचली तल में दो बेसमेंट हैं संपूर्ण हमाम खाणा (स्नानघर) में छह कमरे हैं जो एक-दूसरे के साथ जुड़ी हुई हैं। लोहे के बने एक बड़े स्नान टब को लकड़ी के जल में गर्म पानी रखने के लिए मध्य कमरे में रखा गया है। सभी कमरों में प्लास्टर पर जटिल डिज़ाइन के साथ बेन्ट्सबल मेहराब होता है। सभी कमरों में प्लास्टर पर अभिरुचि और सजावटी उत्कीर्णन है|","ग्वालियर फोर्ट, ग्वालियर 474001", "15 वीं शताब्दी में तोमर राजा करण सिंह द्वारा निर्मित","Not Available", "75140407777");

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[14], "भीम सिंह राणा छत्री", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "भीमसिंग राणा गोहाद के जाट राजा थे वह 1754-1756 ए.डी. के दौरान ग्वालियर किला पर शासन किया था। वह मराठा के खिलाफ युद्ध में मृत्यु हो गई थी। ग्वालियर के किले में जोहर कुंड के पास जाट शासक बनाया गया था। भीमशिंग राणा सेनोटैफ 4 फीट ऊंची प्लेट के आकार और आकार के द्वारा बनाया गया वर्ग है। यह श्लोक 3 कहानी है और सिख को सिनोोटैफ़ के ऊपर बनाया गया है।","ग्वालियर फोर्ट, ग्वालियर 474001", "ग्वालियर किले में जोहरकुक के पास जाट शासक द्वारा निर्मित","Not Available", "075140407777" );

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[15], "विक्रम मंदिर महल", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "तोमर राजवंश के यशस्वी राजा मानसिंह के बाद उनका पुत्र विक्रमादित्य 1516-1523 ई. तक ग्वालियर किले पर राज्य किया। यह महल इन्हीं के द्वारा निर्मित कराया गया था। यह महल कर्ण महल के सामने मानमंदिर के पीछे स्थित है। महल का स्वरूप मंदिर जैसा दिखने के कारण इसे विक्रम मंदिर के नाम से जाना जाता है। महल की लम्बाई 212 फीट है। महल के अंदर खुला बरामदा है जिसमें 12 दरवाजेनुमा बारादरी है। यहीं पर राजा दरबार लगता था। महल के ऊपरी मंजिल में चढ़ने हेतु सीढ़ी का निर्माण किया गया है। " , "ग्वालियर फोर्ट, ग्वालियर 474001", "तोमर राजवंश के यशस्वी राजा मानसिंह पुत्र विक्रमादित्य के द्वारा निर्मित कराया गया था।","Not Available", "75140407777");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[16], "रानी लक्ष्मी बाई की छत्री", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "महारानी लक्ष्मीबाई का जन्म कानपुर के पास विठूर मे हुआ था। विवाह झांसी के राजा गंगाधर राव के साथ हुआ था और महाराजा की मृत्यु के बाद यह झांसी की शासिका बनी और मृत्यु पूर्व तक महारानी लक्ष्मीबाई झांसी की रानी के नाम से प्रसिद्ध रही। प्रथम स्वतंत्रता संग्राम में महारानी लक्ष्मीबाई अंग्रेजों के विरूद्ध युद्ध किया और लड़ते हुये स्वर्णरेखा नदी के किनारे वीरगति को प्राप्त हुई। उनकी याद में समाधि का निर्माण किया गया है। प्रसिद्ध कवियत्री सुभद्रा कुमारी चैहान ने लिखा है।" +
                        "\n" +
                        "जाओ रानी याद करेंगे,\n" +
                        "कृतज्ञ भारतवासी,\n" +
                        "तेरा स्मारक तू ही होगा,\n" +
                        "तेरी अमिट कहानी,","ग्वालियर (म.प्रदेश) 474001", "रानी लक्ष्मी बाई की याद में समाधि का निर्माण किया गया है। ","Not Available", "75140407777" );
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[17], "झिलमिलेष्वर महादेव मंदिर ", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "इस स्थान को तनय पाण्डे उर्फ तानसेन साधन स्थली कहा जाता है। जनश्रुति है कि यहां पर बरगद के वृक्ष के नीचे स्थित शिव मंदिर के चबूतरे पर तानसेन साधना किया करते थे। वर्तमान मंदिर परवर्ती काल का है, जो भू-स्खलन के कारण एक ओर झुक गया है जिससे स्पष्ट होता है कि, यह लघु मंदिर प्राचीन शिव मंदिर के स्थल पर परवर्ती काल में बनवाया गया है। समीप ही 10-11वीं शती ई. की कलाकृतियों में यथा एक मुखी शिव लिंग, मातृका पट्ट, नन्दी, विष्णु प्रतिमा खण्ड, उमा महेश्वर, शिव प्रतिमा खण्ड आदि विद्यमान है। उस शिव मंदिर के स्थल पर एक मुखी शिवलिंग स्थापित या, इसी मंदिर में तानसेन 15वीं शती ई. में आराधना एवं साधना की होगी।",  "ग्वालियर (म.प्रदेश) 474001", "यह लघु मंदिर प्राचीन शिव मंदिर के स्थल पर परवर्ती काल में बनवाया गया है।","Not Available", "75140407777");

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[19], "गढ़ी बेहट", "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "\n"+"यह गढ़ी बेहट ग्राम के मध्य में स्थित है। गढ़ी के निर्माण के समय चारों ओर से गहरी खाई बनायी गयी थी जिसके भीतर वर्गाकार प्राकार निर्मित किया गया। खाई अभी भी सुरक्षित है। वर्गाकार प्राकार में एक निश्चित अन्तराल पर बुर्ज बने हुये है जिनमें नीचे की ओर कक्षों की संरचना है। इन्ही कक्षों के समीप से प्राकार भित्ति के ऊपर जाने के लिये सोपान बने हुये है। गढ़ी में पूर्व एवं दक्षिण की तरफ दो प्रवेश द्वार है। प्राकार के भीतर गढ़ी में जाने के लिये स्वस्तिक आकार के मार्ग से प्रवेश होता है। गढ़ी वर्गाकार है जिसके प्रत्येक कोने पर पुनः बुर्जो की संरचना है। इन बुर्जो पर जाट शासकों ने तोपें लगाी रखी थी जिनमें से एक तोप आज भी उत्तर पश्चिमी कोने के बुर्ज पर स्थित है। गढ़ी में उत्तरी ओर द्विमंजिला आवासीय भवन थे जो भग्न हो चुके है। वर्तमान में गढ़ी की केवल भित्तियां सुरक्षित है। प्रांगण में झाड़-झंकार उगे हुये है।" +
                        "\n" +
                        "इस गढ़ी का निर्माण गोहद के जाट शासक छत्रसिंह ने 18 वीं शती ईस्वी में करवाया था उस समय जाटों ने अपना मुख्यालय गोहद के स्थान पर बेहट को बनाया था। गढ़ी ऐतिहासिक एवं पुरातत्वीय दृष्टि से महत्वपूर्ण है। अतः इसे विभाग के संरक्षण में लिया जाना प्रस्तावित है।"," ग्राम बेहट जिला ग्वालियर (म.प्रदेश) 474001","\n"+"\n"+ "गढ़ी के निर्माण के समय चारों ओर से गहरी खाई बनायी गयी थी जिसके भीतर वर्गाकार प्राकार निर्मित किया गया। ","Not Available", "75140407777"  );

        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[18], "किला पिछोर बावड़ी",  "ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "पिछोर के इतिहास के प्रमाण हमें मध्यकाल से मिलना प्रारम्भ हो जाते हैं। पिछोर का पुराना नाम ‘‘चम्पा नगरी’’ था जो तोमर व क्षत्रिय राजपूत राजाओं के मध्य युद्ध 1313 ई. में युऋ में नष्ट हो गई। 1675 ई. में इस क्षेत्र पर बुन्देला शासक राजवीर वृषभदेव सिंह का राज्य था। वर्तमान में किला का उत्तरी व पश्चिमी भाग निमार्ण भी राजवीर बुन्देला ने कराया था। बुन्देलों का इस क्षेत्र पर लम्बे समय तक शासन रहा, बाद में जाट राजाओं ने इस क्षेत्र पर अधिकार कर लिया। जाटों ने अनेक किले व गढ़िओं का निर्माण कराया था, पिछोर के किले में भी जाटों ने महल एवं बावड़ी का निर्माण कराया जिसका उपयोग 1847 तक जाट करते रहे। 1847 में पहाड़ सिंह जाट से यह किला अंग्रेजों और महाजदी सिंधिया ने खाली करवा लिया। पहाड़ सिंह के सैनिक सिंधिया सेना में सम्मलित हो गये। 1852 ई. में यह क्षेत्र सिंधिया सरदार दिनकर राव के प्रभाव में था, और उन्होंने इसे तहसील बनाया जो स्वतंत्रा प्राप्ति तक बना रहा। स्वतंत्रता के पश्चात जिले के पुनर्गठन होने पर इसे डबरा तहसील का टप्पा मुख्यालय बनाया गया। वर्तमान में यहां नगर पंचायत है और पिछोर की वर्तमान आवादी लगभग 20 हजार है।","डबरा, ग्वालियर (म.प्रदेश) 474001", " पिछोर के किले में जाटों ने महल एवं बावड़ी का निर्माण कराया ","Not Available", "75140407777");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[20], "चतुर्भुज मंदिर","किला गेट रोड, ग्वालियर", "07:00 am-07:00 pm",
                "चतुर्भज मंदिर भगवान विष्णु को समर्पित है और पूर्वी मार्ग पर ग्वालियर किला के पास स्थित है। यह माना जाता था कि वर्ष 875 ईस्वी में नगरवात्रा के पोते द्वारा प्रतिहारों के दौरान निर्मित किया जाना था। इस मोनोलीथिक मंदिर पर कई संस्कृत शिलालेख उत्कीर्ण हैं। शिलालेख में शून्य के पहले रिकॉर्ड किए गए प्रतिनिधित्व में यह एक बिंदु के रूप में लिखा जाता है।","किला गेट रोड, राज मंडी, लोहमंदी, ग्वालियर, मध्य प्रदेश 474008", " यह माना जाता था कि वर्ष 875 ईस्वी में नगरवात्रा के पोते द्वारा प्रतिहारों के दौरान निर्मित किया जाना था।", "Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[21], "मितावली मंदिर", " मितावली, ग्वालियर", "06:00 am -07:00 pm",
                "चम्बल नदी, जो कि मितावाला मंदिर के ऊपर पहाड़ी के पेड़ से पकाया जाता है, पेड़ों के साथ हरे-भरे हरे रंग की है और नीचे से जमीन से केवल एक चौथाई परिपत्र मंदिर दिखाई देता है। मंदिर के आकार का एक मुख्य मंदिर है जिसमें बाहरी आंगन में खुलने वाले एक बाहरी परिमाणीकरण पथ द्वारा घेर लिया गया एक बड़ा शिला हुआ है।यह मंदिर 64 कक्षों के साथ एक परिपत्र की दीवार से बनता है और एक खुले मंडपा केंद्र में होता है, जो आंगन से अलग होता है, जहां शिव को समर्पित किया जाता है। Circumambularatory पथ स्तम्भ है जो साठ चौथाई या साठ छोटे मंदिरों में खुलते हैं, प्रत्येक आवास एक शिल्लिंग अब, लेकिन मूल रूप से योगिनीस की मूर्तियां रखती है, इसीलिए,इसे चौंसठ योगिनी मंदिर कहा गया|", " मितावली, मध्य प्रदेश 476444","यह मंदिर कच्छापघटा राजा देवपाला द्वारा बनाया गया था",  "Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[22], "पढ़ावली मंदिर", " मितावली, ग्वालियर", "09:30 am -05:30 pm",
                "बैट्टेश्वर से कुछ किलोमीटर दूर एक गढ़ के विशाल गढ़ हैं जो गढ़ी पढ़ावलीको संगमरमर शेर और शेरनी की एक जोड़ी से सुरक्षित रखते हैं। शेरों ने सुन्दरता मंदिर में कदम की एक बड़ी उड़ान की रक्षा की, जहां एक बार किले के शासक पूजा करते थे। भगवान शिव को समर्पित मंदिर की मुंमंदेड जटिल नक्काशियों से सुशोभित है, लेकिन दुख की बात है कि मंडप या गगनचुंबी इमारतों में गड़गड़ाहट का ढेर लग गया है। नक्काशियों के मक़ाबिलियां सुगम रूप से मुंमांदाप की दीवारों को जीवन से बड़ा दिखती हैं। खंभे और लिंटेल के हर इंच में पत्थर में बात करते हैं और लम्बाई की न्यूनतम यूनिट का अंश भी अनछुए नहीं छोड़ा गया है|","मितावली पढ़ावली के पास बानमोर, मोरेना, मध्य प्रदेश", "यह मंदिर 10 वीं सदी ए.डी. के प्रतिहार वंश द्वारा बनाया गया था"," Not Applicable","Not Available");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[23], "बटेश्वर मंदिर", " मितावली, ग्वालियर", "09:30 am -05:30 pm",
                "बट्टेश्वर केवल एक अकेले मंदिर का घर नहीं है, लेकिन यहां पर मंदिर एक विशाल आरा पहेली बनाते हैं, जिसमें 25 एकड़ पहाड़ी ढलान पर बिखरे हुए टुकड़े हैं। दो सौ से अधिक मंदिरों को एक साथ बटेश्वर में पैक किया गया है, कुछ खंडहरों में से कुछ को भारतीय पुरातत्व सर्वेक्षण द्वारा नया जीवन दिया गया है। शिव और विष्णु को समर्पित, जिन्होंने स्वयं सूर्यवंशी या भगवान लक्ष्मण के वंशज माना! और दिलचस्प बात यह है कि मंदिरों को उनकी अलग-अलग समय-सारिणी से संबंधित उनकी अलग-अलग वास्तुकला से अलग किया जा सकता है, कुछ फ्लैट छतों के साथ, जबकि अन्य शिलालेख शिखर के साथ। कई मंदिरों में शिवलों के साथ एक पवित्र स्थान है।", "  मितावली पढ़ावली के पास बानमोर, मोरेना, मध्य प्रदेश", "इसका निर्माण प्रतिहार वंश ने कराया था। ", "Not Applicable", "Not Available");
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[24],"धुमेस्वर मंदिर","धुमेस्वर ,M.P","05:00 am - 09:00 pm",
                "धुमेस्वर महादेव मंदिर, दाबरा बिटारबार रोड के करारीबाटी गांव से 6 किलोमीटर की दूरी के दक्षिण में स्थित गांव में स्थित है। 17 वीं शताब्दी के दौरान इस मंदिर का निर्माण बन्देला शासन द्वारा किया गया था। यह शिव मंदिर अनुबंधित है, बड़ी थाली प्रपत्र शिव लिंग को सींतम में स्थापित किया गया है। यह मंदिर शुरुआती बंडेला और राजपूत शैली के ठीक एक्स्पले है। यह मंदिर भवनों के निर्माण कार्य का बहुत अच्छा उदाहरण है और ऐतिहासिक एवं पुरातात्विक दृश्य के बहुत महत्व है।"," धुमेस्वर , मध्य प्रदेश 475220 "," 17 वीं शताब्दी के दौरान इस मंदिर का निर्माण बन्देला शासन द्वारा किया गया था।"," Not Applicable","Not Available");
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[25],"किला बेहत","बेहत, एम.पी.","05:00 am - 07:00 pm",
                "यह किला दक्षिण में एक उच्च पहाड़ी कोक में स्थित है, जो कि किले के मुख्य द्वार के दक्षिणी भाग में स्थित है, दक्षिण का सामना करना पड़ रहा है, लेकिन वर्तमान किला मूल रूप में नहीं है। बोस्टन और अन्य भाग का निर्माण 16 वीं शताब्दी में किया गया था। आवासीय कक्षा में चारों ओर कालों का निर्माण किया गया था, वर्तमान में सभी नष्ट जाट शासक गोहद को 18 वीं शताब्दी ए.डी. किला एक अदालत या द्वार हॉल का निर्माण किल में राजा कट्टरसिंह द्वारा किया गया है। अदालत या द्वार हॉल sctuture आयताकार है। दरबार हॉल कोर्ट और दीवान-ए-आम के रूप में भाग के उपयोग |","बेहाट रोड, ग्वालियर मध्य प्रदेश", "18 वीं शताब्दी ए.डी. किला  का निर्माण राजा कट्टरसिंह द्वारा किया गया है।"," Not Applicable", "Not Available");
        adapterhistoricalList.add(a);


        a = new AdapterHindiHistorical(covers[26],"रासलीला घर","बरई, ग्वालियर","05:00 am - 07:00 pm",
                "यह स्मारक ग्वालियर के बराई गांव में स्थित है ग्वालियर शहर से 30 किलोमीटर की दूरी पर शिवपुरी राजमार्ग। 1486-1516 ए.डी. के दौरान हमारे शासक काल के महाराजा मानसिंह उमर द्वारा इस शानदार मन्दिर का निर्माण किया गया है। यह स्मारक मस्तें खोलने वाले एमी वेटर स्तंभ आधारित थियेटर का प्रारंभिक रूप है जो कि मध्य और स्तरीय क्षेत्र में स्थित है, कमरे में मैन्नेट के दो तरफ से बनाया गया था यह स्मारक मलबे पत्थर और चूने मोर्टार और पीरलेस सुक्टक्ट्र द्वारा निर्मित है। यह स्मारक ऐतिहासिक और पुरातात्विक veiw का महत्व है रासलेला घर की चारों तरफ एक छत थी जो चार दर्शक थे।","बारई, ग्वालियर, मध्य प्रदेश ","यह स्मारक मलबे पत्थर और चूने मोर्टार और पीरलेस सुक्टक्ट्र द्वारा निर्मित है।"," Not Applicable", "Not Available");
        adapterhistoricalList.add(a);

        a = new AdapterHindiHistorical(covers[27],"लाधेड़ी गेट ","ग्वालियर (म.प्रदेश)","09:00 am - 06:00 pm",
                "लाधेरी या लाधेड़ी गेट का निर्माण अयोध्या के नियंत्रक लद्दाखन ने किया था। बाद में, मान सिंह तोमर ने 15-16 वीं शताब्दी में मुसलमान शासकों के रहने के लिए एक सराय बनाया। जौनपुर के शासक हुसैशा शंकी यहां पर रहे।यहां एक मस्जिद भी मौजूद था। अब केवल गेट बच गया।","ग्वालियर (म.प्रदेश)", "लाधेड़ी गेट का निर्माण अयोध्या के नियंत्रक लद्दाखन ने किया था।", "Not Applicable", "Not Available");

        adapterhistoricalList.add(a);

    }
}