package com.harsh.arbeitewunder.Repository

import com.harsh.arbeitewunder.Model.JobModel

class MainRepository {
    // all of data in this class is for example, we can use our data with api service

    val location= listOf("Bangalore, Karnataka","Pune, Maharashtra","Hyderabad, Arunachal Pradesh","Noida, Uttar Pradesh","Gurgaon, Haryana")
    val category= listOf("All","Programmer", "Backend Developer", "Frontend Developer","Java Developer", "App Developer")


    val items = listOf(
        JobModel(
            "Backend Developer",
            "Google",
            "logo1",
            "Fulltime",
            "Hybrid",
            "SDE2",
            "Bangalore, Karnataka",
            "18LPA",
            "2",
            "Google is seeking an experienced Backend Developer to join our Cloud Platform team. The ideal candidate will design and implement scalable services that power Google's suite of products.",
            "As a Backend Developer at Google, you'll work with cutting-edge technologies to build distributed systems that handle billions of requests. You'll collaborate with product managers, frontend developers, and data scientists to create robust backend services. Requirements include strong knowledge of Java, Python, or Go, experience with distributed systems, and a passion for writing clean, efficient code."
        ),
        JobModel(
            "Frontend Developer",
            "Microsoft",
            "logo2",
            "Fulltime",
            "Hybrid",
            "SDE1",
            "Hyderabad, Arunachal Pradesh",
            "14LPA",
            "2",
            "Microsoft is looking for a talented Frontend Developer to help build intuitive user interfaces for our enterprise products.",
            "In this role, you'll be responsible for implementing responsive web designs, optimizing application performance, and ensuring cross-browser compatibility. You'll work closely with UX designers and backend engineers to create seamless user experiences. Strong proficiency in JavaScript, React, and modern CSS is required. Experience with TypeScript and state management libraries is a plus."
        ),

        JobModel(
            "App Developer",
            "Amazon",
            "logo3",
            "Fulltime",
            "Onsite",
            "SDE2",
            "Pune, Maharashtra",
            "16LPA",
            "2",
            "Amazon is seeking a skilled App Developer to join our mobile team working on the Amazon Shopping app.",
            "You'll be responsible for developing and maintaining features for our Android and iOS applications used by millions of customers. The ideal candidate has deep knowledge of mobile development frameworks, understands app performance optimization, and can work in a fast-paced environment. Experience with Kotlin, Swift, or React Native is required."
        ),

        JobModel(
            "Java Developer",
            "IBM",
            "logo4",
            "Fulltime",
            "Remote",
            "SDE1",
            "Noida, Uttar Pradesh",
            "12LPA",
            "2",
            "IBM is looking for a Java Developer to work on our enterprise-level applications and services.",
            "As a Java Developer at IBM, you'll design, implement, and maintain Java applications that are at the core of our business operations. You'll work with Spring Boot, Hibernate, and microservices architecture to build scalable solutions. Strong knowledge of Java 8+ features, REST APIs, and SQL databases is essential. Experience with cloud platforms like AWS or Azure is beneficial."
        ),

        JobModel(
            "Programmer",
            "Adobe",
            "logo5",
            "Internship",
            "Hybrid",
            "Internship",
            "Noida, Uttar Pradesh",
            "6LPA",
            "2",
            "Adobe is offering an internship opportunity for talented programmers to work on our Creative Cloud suite.",
            "During this internship, you'll gain hands-on experience working on real-world software development projects. You'll collaborate with experienced engineers to implement new features, fix bugs, and optimize existing code. This is a great opportunity for students or recent graduates with strong programming skills in C++, Java, or JavaScript. Basic knowledge of computer graphics concepts is a plus."
        ),

        JobModel(
            "Frontend Developer",
            "Flipkart",
            "logo6",
            "Fulltime",
            "Onsite",
            "SDE1",
            "Bangalore, Karnataka",
            "13LPA",
            "2",
            "Flipkart is seeking a Frontend Developer to help enhance our e-commerce platform's user experience.",
            "In this role, you'll build and optimize customer-facing features for India's leading e-commerce platform. You'll implement responsive designs, integrate with backend APIs, and ensure optimal performance across devices. Strong proficiency in JavaScript, React, Redux, and modern frontend tooling is required. Experience with performance optimization and A/B testing is highly desirable."
        ),

        JobModel(
            "Backend Developer",
            "Oracle",
            "logo7",
            "Fulltime",
            "Remote",
            "SDE2",
            "Hyderabad, Arunachal Pradesh",
            "20LPA",
            "2",
            "Oracle is looking for an experienced Backend Developer to work on our cloud infrastructure services.",
            "As a Backend Developer at Oracle, you'll design and implement scalable services that power enterprise applications. You'll work with distributed systems, database technologies, and cloud infrastructure. Strong knowledge of Java, Python, or Go is required, along with experience in microservices architecture and database design. Familiarity with Oracle Cloud Infrastructure is a plus."
        ),

        JobModel(
            "App Developer",
            "Swiggy",
            "logo8",
            "Parttime",
            "Hybrid",
            "SDE1",
            "Gurgaon, Haryana",
            "8LPA",
            "2",
            "Swiggy is looking for a part-time App Developer to help enhance our food delivery application.",
            "In this role, you'll work on implementing new features, fixing bugs, and optimizing the performance of our mobile applications. You'll collaborate with product managers and designers to create intuitive user experiences. Strong proficiency in React Native or native Android/iOS development is required. Experience with location-based services and payment gateway integration is preferred."
        ),

        JobModel(
            "Java Developer",
            "Infosys",
            "logo9",
            "Fulltime",
            "Onsite",
            "SDE1",
            "Pune, Maharashtra",
            "10LPA",
            "2",
            "Infosys is seeking a Java Developer to join our Enterprise Solutions team working on client projects.",
            "As a Java Developer at Infosys, you'll design and implement enterprise applications for our global clients. You'll work with Java EE, Spring Boot, and various database technologies to build robust solutions. Strong knowledge of Java core concepts, design patterns, and REST APIs is essential. Experience with Agile development methodologies is required."
        ),

        JobModel(
            "Programmer",
            "TCS",
            "logo10",
            "Fulltime",
            "Hybrid",
            "SDE1",
            "Gurgaon, Haryana",
            "9LPA",
            "2",
            "TCS is looking for a Programmer to join our technology services team working on diverse client projects.",
            "In this role, you'll be responsible for developing, testing, and maintaining software applications across various domains. You'll work with multiple programming languages and frameworks based on project requirements. Strong problem-solving skills and adaptability are essential. Knowledge of Java, Python, or .NET technologies is required. Experience with Agile development practices is a plus."
        )

    )

}