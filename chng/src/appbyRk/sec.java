package appbyRk;

import com.example.chng.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;



public class sec extends Activity {

		TextView asd2;
		Button info;
		int a;

	@Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.second);
	    asd2=(TextView)findViewById(R.id.textView2);
	    Intent it = getIntent();
        int a= it.getIntExtra("info",0);
    	
        if (a == 1)
        {
        	asd2.setText("This gun is comes with sharp caliber magazine and hopper fed , tactical milsim marker. The Dual Loading System (DLS) allows the player to switch between magazine fed to hopper "+ 
        "The MRX magazine holds up to 10 rounds that is a spring fed system, this requires you to pre load the mags and"+ 
        "wind the spring up to prime it.");
        		a=2;
        					
            //image.setBackgroundResource(R.drawable.story);
            
        }
        else if (a == 2)
        {
        	asd2.setText("Real wood ak47 is comes up with  the developed auto handguards, grip panels, and stock that transform this A-5 into an AK-patterned marker. These parts are made in a facility that makes real AK parts, and are milled to mil-spec dimensions wherever possible. The included Recon Barrel—a leader in its class for accuracy and durability—is augmented with a reproduction gas tube on top, and includes a front sight post to help you get on target. The stock mounts securely to your shoulder to help steady your aim, and the grip panels feel smooth in your hand."+
        				"The magazine kit includes a magwell that helps reproduce the lines of a real AK47, giving you the aesthetic balance that you need. The magazine is a full-size reproduction of a real AK mag, and gives your support hand a steady place to grip if you miss the forward tactical grip on your new A-5.");
            //image.setBackgroundResource(R.drawable.story1_3);
        	a=3;
        }
        else if (a == 3)
        {
        	asd2.setText("The Airowgun is the latest in paintball technology.It is the only bow-powered paintball marker in the world today." + 
        				"it is Deadly accurate and ultra-quiet because of air push physics. Outranges most other paintball markers by nearly 30 feet");
            //image.setBackgroundResource(R.drawable.story1_4);
        	a=4;
        }
        else if (a == 4)
        {
        	asd2.setText("An assault rifle is a selective fire (selective between semi-automatic, automatic and/or burst fire) rifle that uses "+ "an intermediate cartridge and a detachable magazine."+
        					"Assault rifles are the standard service rifles in most modern armies.  Note the difference between the assault rifle and the battle rifle.");
        	a=5;
           // image.setBackgroundResource(R.drawable.story1_5);
           
        }
        else if (a == 5)
        {
        	asd2.setText("Azodin paintball guns are fast dependable and they look good to., Paintballis introducing the Azodin paintball gun line in their annual paintball Christmas super sale."+
        					"This is one of the most popular paintball guns around,and people are really looking for the cheapest prices online.");
        	a=6;
 
            //image.setBackgroundResource(R.drawable.story1_6);
            
        }
        else if (a == 6)
        {
        	asd2.setText("black cell popular gun product given by tippman it has some key features:"+
						"- Marker Included"+
						" Awesome LETS 2x42 red dot sight"+
						"- Real wood"+
						"- Secure-mounting sight rail"+
						"- Secure-mounting magazine and mag well"+
        				"- Authentic dimensions");
           // image.setBackgroundResource(R.drawable.story1_7);
        	a=7;
        }
        else if (a == 7)
        {
        	asd2.setText("The BT TM-7™ utilizes Mini™ Technology to inflict maximum force from a marker of minimal size. Don’t be fooled by the size of the TM-7’s exterior; it can hang with the big boys and is by no means a lightweight. Once you hold one and pull the trigger, you won’t want to put it down. Its lightweight, yet durable construction is perfect for close quarters or long-range combat. This is the marker that just may have people rethink the way they looked at Mil-Sim paintball markers."+
        					"it has some features like Mini™ Technology Inside,Shift-On-The-Fly, 4-Position Mode Switch,Multiple, Extensive Firing Modes Including Semi/Burst/Full-Auto and ,Low Pressure Operation etc.");
           // image.setBackgroundResource(R.drawable.story1_8);
        	a=8;
        }
        else if (a == 8)
        {
        	asd2.setText("The FN 303 is a semi-automatic less-lethal riot gun designed and manufactured by Fabrique Nationale de Herstal. The FN 303's projectiles have been specifically designed to break up on impact, reducing risks of penetrating injuries.Typical operating scenarios include domestic violence intervention, marking violent suspects and building surveillance.The FN 303 uses compressed air to fire projectiles from a 15-round drum magazine. It is designed to incapacitate the "+
        					"target through blunt trauma without causing critical injuries.");
           
        }
        else if (a == 9)
        {
        	asd2.setText("It takes a long time to shoot a 10-shot group, so I resolved to shoot just 5 shots per pellet and see where that left me. If the five were reasonably close, I would complete the group with the other 5 shots."); 
        	
        }
        else if (a == 10)
        {
        	asd2.setText("The varmint Hunter is a break barrel design with a 38 lb cocking effort, but due to the long sweep of the cocking action seemed lighter to me. The gun is advertised to generate velocities of 1000 fps, which is pretty close to what I achieved with some projectiles. In the accompanying table you will see the results I obtained using the Gamo Raptor, Hunter Roundnose, and Predator Polymag pellets amongst others.");

 }
        else if (a == 11)
        {
        	asd2.setText("Electro-pneumatic Paintball Marker wrapped in a mil-sim frame! The G1 has been designed for the entry level and Scenario player, offering the perfect platform from which to build a dream woodsball marker.the G1 has been designed for the entry level and Scenario players. Built using the latest technology:");

 }
        else if (a == 12)
        {
        	asd2.setText("The Heckler & Koch HK416 is an assault rifle designed and manufactured by Heckler & Koch. It is based on the AR-15 platform, originally conceived as an improvement to the Colt M4 carbine family issued to the U.S. military, with the notable inclusion of an HK-proprietary short-stroke gas pistonsystem derived from the Heckler & Koch G36. Military and law enforcement customers have the option of purchasing a new upper receiver, buffer and drive spring to refurbish existing AR-15s or; buy new build complete HK416s.");

 }
        else if (a == 13)
        {
        	asd2.setText("The Spyder MR1 will take a beating and keep on firing! The slide out pull pin, field strippable bolt, and full-length stock (included) make the MR1 an easily operated and highly accurate scenario marker with military resilience and stability.This semi-auto marker won't rust even when you're trekking through the wettest terrain, and you can play hard knowing you have a marker that will withstand anything you throw its way! ");

 }
        else if (a == 14)
        {
        	asd2.setText("Negev machine gun features dual feed system, so it can alternatively use standard disintegrating belts or detachable box magazines. Belt feed unit is installed on the top of receiver, with belt feeding direction from left to right. Belt feed is operated by the side-mounted swinging lever.");

 }
        else if (a == 15)
        {
        	asd2.setText("The Weyland-Yutani Model 102 Sniper Rifle, also known as the WY-102 Railgun or sniper rifle is a weapon designed for Weyland-Yutani armed forces. It is also used by Colonial Marines.The WY-102 Railgun is a weapon designed for extreme range. ");

 }
        else if (a == 16)
        {
        	asd2.setText("AEK-999 'Barsook' (Badger) (Russian : ??????) is a Russian machine gun chambered for the 7.62x54mmR round. It is a modernized version of the PKM machine gun, developed during the 1990s in order to improve its capabilities in the LMG/SAW role. It was to be capable of sustained automatic fire without requiring a quick-change barrel.");

 }
        else if (a == 17)
        {
        	asd2.setText("The shoulder mounted machine gun is similar to the minigun, but with a slower rate of fire and the bulk of the weapon resting on the user's shoulder like the missile launcher.Due to its high damage per shot and good rate of fire, it is the most effective 10mm weapon in the game.");

 }
        else if (a == 18)
        {
        	asd2.setText("Kingman's Spyder Xtra 2007 is the updated version of top gun in Kingman's Classic Series which means it's the most upgraded of their entry-level,mechanical paintball guns. It is a very simple blowback gun with just a few upgrades over the Spyder Victor or Spyder Sonix.It comes with a standard ASA, double trigger, sight rail and a vertical feed tube.");

 }
        else if (a == 19)
        {
        	asd2.setText("We've always found the Ruger SR-556® to be a  standout; excellent fit and finish, demonstrating a high degree of accuracy and the 2 stage piston driven operating system has been rock solid reliable and clean running.");

 }
        else if (a == 20)
        {
        	asd2.setText("T68 SplitFire Dual Feed Paintball Marker features a dual-source ammunition feeding system, capable of providing two different types of .68 caliber ammunition at the turn of a dial. The T68 SplitFire can carry two types of ammunition simultaneously, and allows the operator to select the most effective projectiles for the situation—then change back as needed, at the turn of a dial. When the situation changes, so can your ammunition. Immediately.The T68 SplitFire has a removable carry handle with standard iron sights that are adjustable for elevation and windage. With the carry handle removed, the T68 SplitFire can take any standard scope, sight, or mount on the flattop rail. They have endless configurations, and are fully compatible with mil-spec attachments. The T68 SplitFire has an authentic charging handle just like a real assault rifle, making it ideal for cross-training…and deployment by personnel already familiar with M4 carbine variants.");

 }
        else if (a == 21)
        {
        	asd2.setText("this is GUN WITH an AR-style carry handle with removable picatinny rail, picatinny quad-rail forend, 25-round magazine, and features an adjustable stock. Every gun comes with a gun lock and a 1 year limited warranty.");

 }
        else if (a == 22)
        {
        	asd2.setText("this Gun is a compact mil-sim look marker with an ergonomically-positioned front vertical grip. The marker’s patent-pending design makes gaining access to internals significantly easier – simply unscrew the barrel, push the unlock button on the collar, remove the barrel nut and flip the top half of the receiver off. Once inside, the modular layout of the FT-12 allows for incredibly fast and worry-free access to all key parts. The FT-12 is ideal for anyone seeking an incredibly easy-to-maintain marker that has the known reliability of a Tippmann.");

 }
	    
    	 
    
}}
	
     		 
    		 
         
     
        
       
    






