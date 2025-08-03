import { useState } from "react";
import BookDetails from "./BookDetails";
import BlogDetails from "./BlogDetails";
import CourseDetails from "./CourseDetails";

function App() {
  const [view, setView] = useState("book");

  let element;
  if (view === "book") {
    element = <BookDetails />;
  } else if (view === "blog") {
    element = <BlogDetails />;
  } else {
    element = <CourseDetails />;
  }

  return (
    <div>
      <h1>Blogger App</h1>

      <button onClick={() => setView("book")}>Book</button>
      <button onClick={() => setView("blog")}>Blog</button>
      <button onClick={() => setView("course")}>Course</button>

      <div style={{ marginTop: "20px" }}>{element}</div>
    </div>
  );
}

export default App;
