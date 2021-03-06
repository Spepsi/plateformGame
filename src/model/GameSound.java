package model;

import org.newdawn.slick.Music;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Sound;

public class GameSound  {

	
	public static Sound shotgun ;
	public static Sound death;
	public static Sound jump;
	public static Sound injury;
	public static Sound bonus;
	
	
	public static Music verdi;
	
	public static void init(){
		try {
			shotgun = new Sound("sound/shotgun.ogg");
			death = new Sound("sound/death.ogg");
			jump = new Sound("sound/jump1.ogg");
			injury = new Sound("sound/injury.ogg");
			bonus = new Sound("sound/bonus.ogg");
			
			verdi = new Music("sound/intro_verdi.ogg");
			
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Sound getSoundById(int i){
		switch(i){
		case 0:
			return shotgun;
		case 1:
			return death;
		case 2 :
			return jump;
		case 3 :
			return injury;
		case 4 :
			return bonus;
		default:
			return null;
		}
	}
	
	public static Integer soundToId(Sound s){
		if(s==shotgun){
			return 0;
		}
		if(s==death){
			return 1;
		}
		if(s==jump){
			return 2;
		}
		if(s==injury){
			return 3;
		}
		if(s==bonus){
			return 4;
		}
		return -1;
	}
}
