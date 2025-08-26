# 🚀 Project: AI-Enhanced Task Manager

## 🔧 Technology Stack

### Backend
- **Spring Boot** → core backend framework
- **Spring Security + JWT** → authentication & authorization
- **Spring Data JPA** → ORM
- **Gemini API (Google)** → AI-powered task suggestions, priority, sentiment
- **Maven/Gradle** → Build tool
- **JUnit + Mockito** → Unit testing
- **Spring Boot Actuator** → health checks & basic monitoring

### Database
- **H2 (in-memory)** → for dev/testing
- **PostgreSQL/MySQL** → for production

### Frontend
- **React (Vite or CRA)** → SPA for UI
- **Tailwind CSS** → clean styling
- **Axios** → call backend APIs with JWT
- **React Router** → navigation (Login, Register, Dashboard)

### Dev/Prod Tooling
- **Dev mode**: Spring Boot DevTools, H2 console, DEBUG logs, Postman/Insomnia
- **Prod mode**: Spring Boot Actuator (health, metrics), INFO logs, optional Prometheus/Grafana monitoring

---

## 📦 Core Components

1.  **Authentication & User Management**
    - **Entity**: `User { id, username, password, role }`
    - **Endpoints**:
        - `POST /auth/register` → Signup
        - `POST /auth/login` → Login + returns JWT
    - **Password hashing**: BCrypt
    - **JWT Filter**: Intercept requests, validate tokens

2.  **Task Management**
    - **Entity**: `Task { id, title, description, priority, sentiment, ownerUserId }`
    - **Endpoints (JWT secured)**:
        - `POST /tasks` → Create task
        - `GET /tasks` → List tasks for logged-in user
        - `PUT /tasks/{id}` → Update task
        - `DELETE /tasks/{id}` → Delete task

3.  **AI Integration (Gemini API)**
    - **Service**: `AiService` → calls Gemini via REST
    - **Endpoints**:
        - `POST /tasks/ai/generate` → Suggest full description & priority from short title
        - `POST /tasks/ai/analyze` → Sentiment/urgency analysis

4.  **Role-Based Access (Optional)**
    - **Roles**: `ROLE_USER`, `ROLE_ADMIN`
    - **User** → only sees own tasks
    - **Admin** → can view all users/tasks

5.  **Frontend (React Components)**
    - **LoginPage** → Login form (calls `/auth/login`)
    - **RegisterPage** → Signup form (calls `/auth/register`)
    - **Dashboard** → Shows task list + logout
    - **TaskList** → Display tasks (calls `/tasks`)
    - **TaskForm** → Add/update tasks
    - **AiTaskForm** → Calls `/tasks/ai/generate` → auto-suggest description/priority

---

## ⚡ Final Deliverable

- **Backend**: Spring Boot REST API with JWT-secured endpoints + AI integration
- **Frontend**: React app for authentication, task management, and AI-powered suggestions
- **DevOps Ready**: Profiles (`application-dev.yml`, `application-prod.yml`), Actuator endpoints, containerizable with Docker

> 👉 This stack makes this project:
>
> - ✅ Great for learning Spring Boot, JWT, and AI integration
> - ✅ Resume-ready (Backend + Frontend + AI + Security)
> - ✅ Expandable later (deploy to AWS/Render/Heroku, add monitoring)