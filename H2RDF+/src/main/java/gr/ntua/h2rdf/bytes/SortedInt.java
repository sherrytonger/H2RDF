/*******************************************************************************
 * Copyright [2013] [Nikos Papailiou]
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 ******************************************************************************/
package gr.ntua.h2rdf.bytes;

public class SortedInt {
	public static final long FIRST_BIT = 0x000000007FFFFFFFL;
	public static final long POSSITIVE = 0x0000000080000000L;
	public static final long NEGATIVE = 0x0000000000000000L;
	public static final long FIRST_BIT1 = 0x7FFFFFFFFFFFFFFFL;
	public static final long POSSITIVE1 = 0xFFFFFFFF80000000L;
	public static final long NEGATIVE1 = 0x0000000000000000L;

	public static long toSortedInt(int l){
		long ret= l & FIRST_BIT;
		if(l<0){
			ret=ret | NEGATIVE;
		}
		else{
			ret=ret | POSSITIVE;
		}
		return ret;
	}
	
	public static int toInt(long l){
		long ret= l & FIRST_BIT;
		if((l & POSSITIVE) == POSSITIVE){
			ret=ret | NEGATIVE1;
		}
		else{
			ret=ret | POSSITIVE1;
		}
		
		return (int) ret;
	}
	
	
	public static void main(String[] args)
    {
    	int l= Integer.MIN_VALUE;
    	long il= toSortedInt(l);
    	int il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t\t\t\t"+il2);
    	l= -533445456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -133445456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -33445456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -3445456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -445456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -45456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -545;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= -1;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t\t"+il2);
    	l= 0;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 545;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 45456;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 4454566;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 34454566;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 334454566;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= 1334454566;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t"+il2);
    	l= Integer.MAX_VALUE;
    	il= toSortedInt(l);
    	il2= toInt(il);
    	System.out.println(l+" \t\t"+Long.toBinaryString(il)+"\t"+il2);
    }
}
