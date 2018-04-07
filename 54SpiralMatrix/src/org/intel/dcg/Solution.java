package org.intel.dcg;
import java.util.*;
class Solution {
	List<Integer> res = new ArrayList<>();
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
    public List<Integer> spiralOrder(int[][] matrix) {
    	System.out.println(matrix[0].length);
    	System.out.println(matrix.length);
    	if(matrix.length == 0){
    	}else if(matrix.length == 1){
    		for(int i = 0; i<matrix[0].length;i++){
    			res.add(matrix[0][i]);
    		}
    	}
    	else{
			int cDirectionStep = 0;
			int totalStepCount = 0;
			char cDirection = 'r';
			init(matrix);
			while(totalStepCount<(matrix.length*matrix[0].length)){
				while(cDirectionStep < this.moveLength.get(cDirection)){
					res.add(getPosition(cDirection, cDirectionStep, matrix));
					cDirectionStep += 1;
					totalStepCount +=1;
				}
				System.out.println(totalStepCount);
				this.moveRound.put(cDirection,this.moveRound.get(cDirection)+1);
				cDirection = moveDirection.get(cDirection);
				if(cDirection == 'r' || cDirection == 'l'){
					this.moveLength.put(cDirection, matrix[0].length-this.moveRound.get(this.moveDirection.get(cDirection))-this.moveRound.get(this.moveLastDirection.get(cDirection)));
				}else{
					this.moveLength.put(cDirection, matrix.length-this.moveRound.get(this.moveDirection.get(cDirection))-this.moveRound.get(this.moveLastDirection.get(cDirection)));
				}
				cDirectionStep = 0;
			}
    	}
        return res;
    }
    void init(int[][] matrix){
    	this.moveLength.put('r',matrix[0].length);
    	this.moveLength.put('d',matrix.length);
    	this.moveLength.put('l',matrix[0].length);
    	this.moveLength.put('u',matrix.length);
    	this.moveRound.put('r',0);
    	this.moveRound.put('d',0);
    	this.moveRound.put('l',0);
    	this.moveRound.put('u',0);
    }
    int getPosition(Character moveDirection, int moveStep, int[][] matrix){
    	int first=0;
    	int second=0;
    	if(moveDirection == 'r'){
    		first = this.moveRound.get(this.moveLastDirection.get(moveDirection));
    		second = this.moveRound.get(this.moveLastDirection.get(moveDirection))+moveStep;
    	}else if(moveDirection == 'd'){
    		first = moveStep+this.moveRound.get(this.moveLastDirection.get(moveDirection));
    		second = matrix[0].length-this.moveRound.get(this.moveLastDirection.get(moveDirection));
    	}else if(moveDirection == 'l'){
			first = matrix.length-this.moveRound.get(this.moveLastDirection.get(moveDirection));
			second = matrix[0].length-this.moveRound.get(this.moveLastDirection.get(moveDirection))-moveStep-1;
    	}else{
			first = matrix.length-this.moveRound.get(this.moveLastDirection.get(moveDirection))-moveStep-1;
			second = this.moveRound.get(this.moveLastDirection.get(moveDirection))-1;
    	}
    	return matrix[first][second];
    }
}