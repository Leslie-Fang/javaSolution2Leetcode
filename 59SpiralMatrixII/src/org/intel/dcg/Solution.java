package org.intel.dcg;
import java.util.*;
class Solution {
	Map<Character, Character> moveDirection = new HashMap<Character, Character>();
	Map<Character, Character> moveLastDirection = new HashMap<Character, Character>();
	Map<Character, Integer> moveLength = new HashMap<Character, Integer>();
	Map<Character, Integer> moveRound = new HashMap<Character, Integer>();
	{
		this.moveDirection.put('r','d');
		this.moveDirection.put('d','l');
		this.moveDirection.put('l','u');
		this.moveDirection.put('u','r');
		this.moveLastDirection.put('d','r');
		this.moveLastDirection.put('l','d');
		this.moveLastDirection.put('u','l');
		this.moveLastDirection.put('r','u');
	}
    public int[][] generateMatrix(int n) {
    	int[][] res = new int[n][n];
    	int[] pos;
    	if(n == 0){
    		//return res;
    	}else if(n == 1){
    		res[0][0] = 1;
    		//return 1;
    	}else{
    		int cDirectionStep = 0;
			int totalStepCount = 0;
			char cDirection = 'r';
			init(n);
			while(totalStepCount<(n*n)){
				while(cDirectionStep < this.moveLength.get(cDirection)){
					pos = getPosition(cDirection, cDirectionStep, n);
					res[pos[0]][pos[1]] = totalStepCount+1;
					cDirectionStep += 1;
					totalStepCount +=1;
				}
				this.moveRound.put(cDirection,this.moveRound.get(cDirection)+1);
				cDirection = moveDirection.get(cDirection);
				if(cDirection == 'r' || cDirection == 'l'){
					this.moveLength.put(cDirection, n-this.moveRound.get(this.moveDirection.get(cDirection))-this.moveRound.get(this.moveLastDirection.get(cDirection)));
				}else{
					this.moveLength.put(cDirection, n-this.moveRound.get(this.moveDirection.get(cDirection))-this.moveRound.get(this.moveLastDirection.get(cDirection)));
				}
				cDirectionStep = 0;
			}
    	}
    	return res;
    }
    void init(int n){
    	this.moveLength.put('r',n);
    	this.moveLength.put('d',n);
    	this.moveLength.put('l',n);
    	this.moveLength.put('u',n);
    	this.moveRound.put('r',0);
    	this.moveRound.put('d',0);
    	this.moveRound.put('l',0);
    	this.moveRound.put('u',0);
    }
    int[] getPosition(Character moveDirection, int moveStep, int n){
    	int first=0;
    	int second=0;
    	if(moveDirection == 'r'){
    		first = this.moveRound.get(this.moveLastDirection.get(moveDirection));
    		second = this.moveRound.get(this.moveLastDirection.get(moveDirection))+moveStep;
    	}else if(moveDirection == 'd'){
    		first = moveStep+this.moveRound.get(this.moveLastDirection.get(moveDirection));
    		second = n-this.moveRound.get(this.moveLastDirection.get(moveDirection));
    	}else if(moveDirection == 'l'){
			first = n-this.moveRound.get(this.moveLastDirection.get(moveDirection));
			second = n-this.moveRound.get(this.moveLastDirection.get(moveDirection))-moveStep-1;
    	}else{
			first = n-this.moveRound.get(this.moveLastDirection.get(moveDirection))-moveStep-1;
			second = this.moveRound.get(this.moveLastDirection.get(moveDirection))-1;
    	}
    	int[] res = new int[]{first,second};
    	return res;
    }
}