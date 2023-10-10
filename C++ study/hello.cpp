#include <iostream> 
//compile: g++ -std=c++11 fname.cpp 
//this is not valid in gcc 
//online compiler is valid 
//version c++11 
class GroupFunction{ 

	private: 

		char* exResult = "deadline na!";//code of horror 

	public: 

		friend class Teacher; 

		friend std::ostream& operator<<(std::ostream& os,GroupFunction result); 

		GroupFunction(); 

		 

}obj; 

std::ostream& operator<<(std::ostream& out,GroupFunction result){ 

	out << result.exResult << std::endl; 

	return (out); 

} 

class Teacher{ 
    private: 
	    const int student_age = 13; 
	public: 

		int* Student_Project(GroupFunction project){ 

			char* conv = new char[student_age]; 

			int pattern[13] {28,31,24,24,21,56,68,13,21,18,24,32,67}; 

			for(int first = 0;first < (sizeof(pattern)/sizeof(pattern[0])); ++first){ 

				for(int second = 1;;++second){ 

					if(100 == (pattern[first] + second)){ 

						*(conv + first) = {(char)second}; 

						 

						break; 

					} 

				} 

			} 

			return (int*)conv; 

		} 

		int* ResultConv(int* in){ 

			char* conv = new char[student_age]; 

			conv = (char*)in; 

			for(int first = 0; first < student_age; ++first){ 

				int i = *(conv + first); 

				if(65 <= i & 90 >= i){ 

					*(conv + first) = i + 32; 

				}else{ 

					*(conv + first) = i; 

				} 

			} 

			return (int*)conv; 

		} 
}; 

GroupFunction::GroupFunction(){ 

	Teacher task; 

	int* format = task.ResultConv(task.Student_Project(obj)); 
	*(format + 0) = (*(format + 0) - 32); 
	exResult = (char*)format; 

} 

class VirtualMain{ 

	public: 

		VirtualMain(){ 

			GroupFunction start = GroupFunction(); 

			std::cout<< start; 
	} 

}VirtualMain;//virtual main function 

int main(void){ 
//original main functon 
}