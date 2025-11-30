# How to Upload to GitHub (Step-by-Step)

To build your APK, you need to put this code on GitHub.

## Method 1: Using the Website (Easiest if no Git installed)

1.  **Create an Account**: Go to [github.com](https://github.com) and sign up/login.
2.  **New Repository**:
    *   Click the **+** icon in the top right corner.
    *   Select **"New repository"**.
    *   Name it `android-calculator`.
    *   Make it **Public**.
    *   Click **"Create repository"**.
3.  **Upload Files**:
    *   Look for the link **"uploading an existing file"** (usually under "Quick setup").
    *   Or click **"Add file"** > **"Upload files"**.
    *   **Drag and drop** the entire content of your `calculator` folder here.
    *   **Important**: Make sure `.github` folder is uploaded! (You might need to drag folders carefully).
    *   Click **"Commit changes"**.

## Method 2: Using Git Command Line (Recommended)

If you have Git installed, open a terminal in this folder and run:

```bash
# 1. Initialize Git
git init

# 2. Add all files
git add .

# 3. Commit
git commit -m "Initial commit of Calculator App"

# 4. Link to GitHub (Replace URL with YOUR repo URL)
# You get this URL after creating a repo on GitHub website
git remote add origin https://github.com/YOUR_USERNAME/android-calculator.git

# 5. Push
git branch -M main
git push -u origin main
```

## After Uploading
1.  Go to your repository page on GitHub.
2.  Click the **"Actions"** tab at the top.
3.  You should see **"Build Android APK"** running (yellow circle).
4.  Wait for it to turn Green (Success).
5.  Click on it, then click **"calculator-apk"** under "Artifacts" to download your App!
