package com.example.a77

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /**0과 1로 이루어진 어떤 문자열 x에 대한 이진 변환을 다음과 같이 정의합니다.

        x의 모든 0을 제거합니다.
        x의 길이를 c라고 하면, x를 "c를 2진법으로 표현한 문자열"로 바꿉니다.
        예를 들어, x = "0111010"이라면,
        x에 이진 변환을 가하면 x = "0111010" -> "1111" -> "100" 이 됩니다.

        0과 1로 이루어진 문자열 s가 매개변수로 주어집니다.
        s가 "1"이 될 때까지 계속해서 s에 이진 변환을 가했을 때,
        이진 변환의 횟수와 변환 과정에서 제거된 모든 0의 개수를 각각 배열에 담아
        return 하도록 solution 함수를 완성해주세요.

        리턴값 =["이진변환한 횟수","0이 제거된 총횟수"]
         */
        class Solution {

            fun solution(s: String): IntArray {
                var answer: IntArray = intArrayOf()
                var countedBinary = 0 // 이진 변환한 횟수
                var countedZero = 0 // 0이 제거된 횟수
                var temp = mutableListOf<Char>()
                var s_temp = s

                do{
                    countedBinary++
                    //0 제거
                    for (index in 0..s_temp.length-1){
                        if(s_temp.get(index)!='0') temp.add('1')
                        else countedZero++
                    }
                    //길이만큼 이진법으로 변환 이후 string값 반환
                    s_temp =Integer.toBinaryString(temp.size)
                    temp = mutableListOf<Char>()//매개변수 초기화

                }while(s_temp.equals("1") == false)
                answer = intArrayOf(countedBinary,countedZero)
                return answer
            }
        }
        val a = Solution()
        a.solution("110010101001")
        a.solution("01110")
        a.solution("1111111")
    }
}