var path = require('path')
var HtmlWebpackPlugin = require('html-webpack-plugin')

const PATHS = {
  app: path.join(__dirname, 'src'),
  dist: path.join(__dirname, 'dist')
}

module.exports = {
  entry: {
    app: path.join(PATHS.app, 'app.js')
  },
  output: {
    path: PATHS.dist,
    filename: 'bundle.js'
  },
  devServer: {
    contentBase: PATHS.dist,
    inline: true,
    port: 3000,
    watchOptions: {
      poll: true
    }
  },
  devtool: 'eval-cheap-module-source-map',
  resolve: {
    alias: {
      resources: path.join(PATHS.app, 'resources')
    }
  },
  plugins: [
    new HtmlWebpackPlugin({
      template: path.join(PATHS.app, 'index.html'),
      inject: false
    }),
  ],
  module: {
    loaders: [
      {
        test: /\.html$/,
        loader: 'html-loader'
      },
      {
        test: /\.(png|jpg)$/,
        loader: 'file-loader?name=img/[name].[ext]'
      },
      {
        test: /\.css$/,
        loader: 'style-loader!css-loader'
      },
      {
        test: /\.scss$/,
        loader: 'style-loader!css-loader!autoprefixer-loader!sass-loader'
      },
      {
        test: [/fontawesome-webfont\.svg/, /fontawesome-webfont\.eot/, /fontawesome-webfont\.ttf/, /fontawesome-webfont\.woff/, /fontawesome-webfont\.woff2/],
        loader: 'file-loader?name=fonts/[name].[ext]'
      },
      {
        test: /\.js$/,
        exclude: /(node_modules)/,
        loader: 'ng-annotate-loader?add=true!babel-loader',
        query: {
          presets: ['env']
        }
      }
    ]
  }
}
