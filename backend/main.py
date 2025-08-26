import uvicorn
from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware

app = FastAPI()

app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],
    allow_credentials=True,  # Allow cookies and authorization headers
    allow_methods=["*"],  # Allow all HTTP methods (GET, POST, PUT, DELETE, etc.)
    allow_headers=["*"],  # Allow all headers in the request
)

@app.get("/")
def greet():
    return {"Hello": "World"}




if __name__ == "__main__":
    uvicorn.run(app, host="0.0.0.0", port=8002)