# BillingModule

最小化 Android 项目，集成 `com.android.billingclient:billing:9.1.0`，支持通过 GitHub Actions 云端自动构建 `module.apk`。

## 使用 GitHub Actions 构建 APK

1. 在 GitHub 上新建一个仓库（Public 或 Private 均可）。
2. 将本目录内的所有文件（注意包含隐藏目录 `.github`）推送到仓库的 `main` 分支：
   ```bash
   git init
   git add .
   git commit -m "Initial commit"
   git branch -M main
   git remote add origin <你的仓库地址>
   git push -u origin main
   ```
3. 打开 GitHub 仓库的 **Actions** 页面，等待 `Build BillingModule APK` 运行完成。
4. 点击进入该次构建记录，在底部的 **Artifacts** 区域下载 `module-apk`，解压即可得到 `module.apk`。

## 使用 JADX 验证

```bash
jadx -d billing-decompiled module.apk
```

检查以下类是否存在：
- `com.android.billingclient.api.BillingClient`
- `com.android.billingclient.api.Purchase`
- `com.android.billingclient.api.BillingResult`
- `com.android.billingclient.api.ProductDetails`
"# BillingModule" 
