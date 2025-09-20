# 💰 Personal Finance Tracker with AI

A full-stack web application to help users manage their finances, track expenses, set budgets, visualize insights, and get personalized AI-powered financial recommendations.  

Tech Stack:
- **Backend:** Java Spring Boot  
- **Frontend:** React.js  
- **Database:** MySQL  
- **AI Integration (Future):** Custom-trained chatbot for financial guidance  

---

## 🚀 Features

- ✅ User authentication & profile management  
- ✅ Expense tracking (income, expenses, categories, dates, payment methods)  
- ✅ Budget management with alerts  
- ✅ Visual dashboards & charts (monthly/yearly trends)  
- ✅ Export reports (PDF/CSV)  
- ✅ AI chatbot for personal finance tips (future enhancement)  

---

## 🏗️ System Architecture

```plaintext
                ┌─────────────────────┐
                │      Frontend       │
                │    (React.js)       │
                └─────────┬───────────┘
                          │ REST API Calls (JSON)
                ┌─────────▼───────────┐
                │      Backend        │
                │ (Spring Boot APIs)  │
                └─────────┬───────────┘
                          │ JPA/Hibernate
                ┌─────────▼───────────┐
                │     Database        │
                │      (MySQL)        │
                └─────────────────────┘

       (Future) AI Chatbot ↔ Integrated with Backend
# Clone the repository
git clone https://github.com/your-username/personal-finance-tracker-ai.git
cd personal-finance-tracker-ai/backend

# Configure application.properties with your MySQL credentials
# Run the application
./mvnw spring-boot:run
cd frontend
npm install
npm start
CREATE DATABASE finance_tracker_ai;
