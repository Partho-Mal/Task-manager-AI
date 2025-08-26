```bash
src/main/java/com/example/taskmanager
│
├── config
│   ├── SecurityConfig.java       # Spring Security + JWT filter config
│   ├── JwtAuthFilter.java        # Intercepts requests, validates JWT
│   └── JwtUtil.java              # Create/parse JWT tokens
│
├── controller
│   ├── AuthController.java       # /auth/login, /auth/register
│   ├── TaskController.java       # /tasks CRUD
│   └── AiController.java         # /tasks/ai/generate (Gemini)
│
├── entity
│   ├── User.java                 # User entity
│   └── Task.java                 # Task entity
│
├── repository
│   ├── UserRepository.java
│   └── TaskRepository.java
│
├── service
│   ├── UserService.java          # Register/login logic
│   ├── TaskService.java          # Task CRUD
│   └── AiService.java            # Calls Gemini API
│
└── TaskManagerApplication.java   # Main class
```